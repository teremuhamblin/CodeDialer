package com.teremu.secretcodes.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SecretCodeDao {

    @Query("SELECT * FROM secret_codes ORDER BY id ASC")
    suspend fun getAllCodes(): List<SecretCodeEntity>

    @Query("SELECT * FROM secret_codes WHERE category = :category ORDER BY id ASC")
    suspend fun getCodesByCategory(category: String): List<SecretCodeEntity>

    @Query("SELECT DISTINCT category FROM secret_codes ORDER BY category ASC")
    suspend fun getAllCategories(): List<String>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(codes: List<SecretCodeEntity>)
}
