package com.teremu.secretcodes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teremu.secretcodes.database.AppDatabase
import com.teremu.secretcodes.database.DatabaseInitializer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
        recycler.layoutManager = LinearLayoutManager(this)

        val db = AppDatabase.getDatabase(this)
        DatabaseInitializer.populate(db)

        CoroutineScope(Dispatchers.IO).launch {
            val codes = db.secretCodeDao().getAllCodes()

            runOnUiThread {
                recycler.adapter = CodeListAdapter(codes.map {
                    com.teremu.secretcodes.models.SecretCode(
                        code = it.code,
                        description = it.description,
                        isDangerous = it.isDangerous
                    )
                }) { code ->
                    CodeExecutor.execute(this@MainActivity, code.code)
                }
            }
        }
    }
}
