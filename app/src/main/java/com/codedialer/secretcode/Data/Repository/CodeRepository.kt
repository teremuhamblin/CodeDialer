package com.codedialer.secretcode.Data.Repository

import com.codedialer.secretcode.Domain.Model.SecretCode
import com.codedialer.secretcode.Domain.Model.Category
import kotlinx.coroutines.flow.Flow

interface CodeRepository {
    fun getAllCodes(): Flow<List<SecretCode>>
    fun searchCodes(query: String): Flow<List<SecretCode>>
    fun getCategories(): Flow<List<Category>>
    suspend fun toggleFavorite(code: SecretCode)
}
