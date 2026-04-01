package com.teremu.secretcodes.models

data class SecretCode(
    val code: String,
    val description: String,
    val isDangerous: Boolean = false
)
