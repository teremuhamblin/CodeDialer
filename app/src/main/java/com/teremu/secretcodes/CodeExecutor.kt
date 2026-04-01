package com.teremu.secretcodes

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

object CodeExecutor {

    fun execute(context: Context, code: String) {
        try {
            val uri = Uri.parse("tel:$code")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(context, "Impossible d'exécuter le code", Toast.LENGTH_SHORT).show()
        }
    }
}
