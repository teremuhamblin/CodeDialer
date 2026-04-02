package com.codedialer.secretcode.Data.Local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "secret_codes")
data class SecretCodeEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val code: String,
    val description: String,
    val categoryId: Int,
    val isFavorite: Boolean = false
)
