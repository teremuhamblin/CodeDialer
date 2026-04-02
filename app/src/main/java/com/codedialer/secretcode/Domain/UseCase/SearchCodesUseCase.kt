package com.codedialer.secretcode.Domain.UseCase

import com.codedialer.secretcode.Data.Repository.CodeRepository

class SearchCodesUseCase(private val repo: CodeRepository) {
    operator fun invoke(query: String) = repo.searchCodes(query)
}
