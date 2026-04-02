package com.codedialer.secretcode.Domain.Model

data class SecretCode(
    val id: Int = 0,
    val code: String,
    val description: String,
    val categoryId: Int,
    val isFavorite: Boolean
)
