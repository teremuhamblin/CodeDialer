package com.codedialer.secretcode.Domain.UseCase

import com.codedialer.secretcode.Data.Repository.CodeRepository

class GetAllCodesUseCase(private val repo: CodeRepository) {
    operator fun invoke() = repo.getAllCodes()
}
