package com.codedialer.secretcode.Domain.UseCase

import com.codedialer.secretcode.Data.Repository.CodeRepository

class GetCategoriesUseCase(private val repo: CodeRepository) {
    operator fun invoke() = repo.getCategories()
}
