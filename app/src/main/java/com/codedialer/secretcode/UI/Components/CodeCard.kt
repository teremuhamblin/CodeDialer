package com.codedialer.secretcode.UI.Components

import android.view.View
import com.codedialer.secretcode.Domain.Model.SecretCode

interface CodeCardListener {
    fun onClick(code: SecretCode)
}
