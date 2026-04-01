package com.teremu.secretcodes.database

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object DatabaseInitializer {

    fun populate(db: AppDatabase) {
        CoroutineScope(Dispatchers.IO).launch {
            val dao = db.secretCodeDao()

            val initialCodes = listOf(
                SecretCodeEntity(code = "*#06#", description = "Afficher l'IMEI"),
                SecretCodeEntity(code = "*#0*#", description = "Menu de test matériel (Samsung)"),
                SecretCodeEntity(code = "*#1234#", description = "Informations firmware"),
                SecretCodeEntity(code = "*#*#4636#*#*", description = "Informations téléphone")
            )

            dao.insertAll(initialCodes)
        }
    }
}
