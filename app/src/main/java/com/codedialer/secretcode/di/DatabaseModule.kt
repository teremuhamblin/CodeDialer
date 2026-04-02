package com.codedialer.secretcode.di

import android.content.Context
import androidx.room.Room
import com.codedialer.secretcode.Data.Local.AppDatabase
import com.codedialer.secretcode.Data.Local.dao.SecretCodeDao
import com.codedialer.secretcode.Data.Local.dao.CategoryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "codedialer.db"
        ).build()

    @Provides
    fun provideSecretCodeDao(db: AppDatabase): SecretCodeDao = db.secretCodeDao()

    @Provides
    fun provideCategoryDao(db: AppDatabase): CategoryDao = db.categoryDao()
}
