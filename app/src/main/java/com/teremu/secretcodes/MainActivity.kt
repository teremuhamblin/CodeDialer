package com.teremu.secretcodes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teremu.secretcodes.database.AppDatabase
import com.teremu.secretcodes.database.DatabaseInitializer
import com.teremu.secretcodes.models.SecretCode
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var categoryRecycler: RecyclerView
    private lateinit var codeRecycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryRecycler = findViewById(R.id.categoryRecycler)
        codeRecycler = findViewById(R.id.codeRecycler)

        categoryRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        codeRecycler.layoutManager = LinearLayoutManager(this)

        val db = AppDatabase.getDatabase(this)
        DatabaseInitializer.populate(db)

        CoroutineScope(Dispatchers.IO).launch {
            val categories = db.secretCodeDao().getAllCategories()

            runOnUiThread {
                categoryRecycler.adapter = CategoryAdapter(categories) { category ->
                    loadCodes(category)
                }
            }
        }
    }

    private fun loadCodes(category: String) {
        val db = AppDatabase.getDatabase(this)

        CoroutineScope(Dispatchers.IO).launch {
            val codes = db.secretCodeDao().getCodesByCategory(category)

            runOnUiThread {
                codeRecycler.adapter = CodeListAdapter(codes.map {
                    SecretCode(it.code, it.description, it.category, it.isDangerous)
                }) { code ->
                    CodeExecutor.execute(this@MainActivity, code.code)
                }
            }
        }
    }
}
