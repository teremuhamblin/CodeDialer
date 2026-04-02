package com.codedialer.secretcode.Data.Local.dao

import androidx.room.*
import com.codedialer.secretcode.Data.Local.entities.SecretCodeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SecretCodeDao {

    @Query("SELECT * FROM secret_codes ORDER BY id DESC")
    fun getAllCodes(): Flow<List<SecretCodeEntity>>

    @Query("SELECT * FROM secret_codes WHERE code LIKE '%' || :query || '%'")
    fun searchCodes(query: String): Flow<List<SecretCodeEntity>>

    @Update
    suspend fun updateCode(code: SecretCodeEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCodes(codes: List<SecretCodeEntity>)
}
