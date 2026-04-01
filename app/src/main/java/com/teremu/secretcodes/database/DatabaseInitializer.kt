package com.teremu.secretcodes.database

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object DatabaseInitializer {

    fun populate(db: AppDatabase) {
        CoroutineScope(Dispatchers.IO).launch {
            val dao = db.secretCodeDao()

            val initialCodes = listOf(
                SecretCodeEntity(code = "*#06#", description = "Afficher l'IMEI", category = "Universel"),
                SecretCodeEntity(code = "*#0*#", description = "Menu de test matériel", category = "Samsung"),
                SecretCodeEntity(code = "*#1234#", description = "Informations firmware", category = "Samsung"),
                SecretCodeEntity(code = "*#*#4636#*#*", description = "Infos téléphone", category = "Android"),
                SecretCodeEntity(code = "*#*#225#*#*", description = "Agenda", category = "Android"),
                SecretCodeEntity(code = "*#*#426#*#*", description = "Diagnostics réseau", category = "Android")
            )

            dao.insertAll(initialCodes)
        }
    }
}
