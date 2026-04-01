package com.teremu.secretcodes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teremu.secretcodes.models.SecretCode

class MainActivity : AppCompatActivity() {

    private val codes = listOf(
        SecretCode("*#06#", "Afficher l'IMEI"),
        SecretCode("*#0*#", "Menu de test matériel (Samsung)"),
        SecretCode("*#1234#", "Informations firmware"),
        SecretCode("*#*#4636#*#*", "Informations téléphone", isDangerous = false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = CodeListAdapter(codes) { code ->
            CodeExecutor.execute(this, code.code)
        }
    }
}
