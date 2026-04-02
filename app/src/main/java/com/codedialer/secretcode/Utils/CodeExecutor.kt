package com.codedialer.secretcode.Utils

import android.content.Context
import android.content.Intent
import android.net.Uri

object CodeExecutor {

    fun execute(context: Context, code: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$code")
        }
        context.startActivity(intent)
    }
}
