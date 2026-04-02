package com.codedialer.secretcode.Data.Local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.codedialer.secretcode.Data.Local.dao.SecretCodeDao
import com.codedialer.secretcode.Data.Local.dao.CategoryDao
import com.codedialer.secretcode.Data.Local.entities.SecretCodeEntity
import com.codedialer.secretcode.Data.Local.entities.CategoryEntity

@Database(
    entities = [
        SecretCodeEntity::class,
        CategoryEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun secretCodeDao(): SecretCodeDao
    abstract fun categoryDao(): CategoryDao
}
