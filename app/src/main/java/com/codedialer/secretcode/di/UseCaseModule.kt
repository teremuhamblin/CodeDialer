package com.codedialer.secretcode.di

import com.codedialer.secretcode.Data.Repository.CodeRepository
import com.codedialer.secretcode.Domain.UseCase.GetAllCodesUseCase
import com.codedialer.secretcode.Domain.UseCase.SearchCodesUseCase
import com.codedialer.secretcode.Domain.UseCase.ToggleFavoriteUseCase
import com.codedialer.secretcode.Domain.UseCase.GetCategoriesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetAllCodesUseCase(repo: CodeRepository) = GetAllCodesUseCase(repo)

    @Provides
    fun provideSearchCodesUseCase(repo: CodeRepository) = SearchCodesUseCase(repo)

    @Provides
    fun provideToggleFavoriteUseCase(repo: CodeRepository) = ToggleFavoriteUseCase(repo)

    @Provides
    fun provideGetCategoriesUseCase(repo: CodeRepository) = GetCategoriesUseCase(repo)
}
