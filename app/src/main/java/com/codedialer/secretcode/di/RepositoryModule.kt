package com.codedialer.secretcode.di

import com.codedialer.secretcode.Data.Local.dao.SecretCodeDao
import com.codedialer.secretcode.Data.Local.dao.CategoryDao
import com.codedialer.secretcode.Data.Repository.CodeRepository
import com.codedialer.secretcode.Data.Repository.CodeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideCodeRepository(
        codeDao: SecretCodeDao,
        categoryDao: CategoryDao
    ): CodeRepository = CodeRepositoryImpl(codeDao, categoryDao)
}
