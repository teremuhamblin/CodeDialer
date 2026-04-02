package com.codedialer.secretcode.Data.Repository

import com.codedialer.secretcode.Data.Local.dao.SecretCodeDao
import com.codedialer.secretcode.Data.Local.dao.CategoryDao
import com.codedialer.secretcode.Data.Mapper.toDomain
import com.codedialer.secretcode.Data.Mapper.toEntity
import com.codedialer.secretcode.Domain.Model.SecretCode
import com.codedialer.secretcode.Domain.Model.Category
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CodeRepositoryImpl(
    private val codeDao: SecretCodeDao,
    private val categoryDao: CategoryDao
) : CodeRepository {

    override fun getAllCodes(): Flow<List<SecretCode>> =
        codeDao.getAllCodes().map { list -> list.map { it.toDomain() } }

    override fun searchCodes(query: String): Flow<List<SecretCode>> =
        codeDao.searchCodes(query).map { list -> list.map { it.toDomain() } }

    override fun getCategories(): Flow<List<Category>> =
        categoryDao.getCategories().map { list -> list.map { it.toDomain() } }

    override suspend fun toggleFavorite(code: SecretCode) {
        val updated = code.copy(isFavorite = !code.isFavorite)
        codeDao.updateCode(updated.toEntity())
    }
}
