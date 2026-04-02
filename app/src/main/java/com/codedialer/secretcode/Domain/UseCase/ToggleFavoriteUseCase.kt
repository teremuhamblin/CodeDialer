package com.codedialer.secretcode.Domain.UseCase

import com.codedialer.secretcode.Data.Repository.CodeRepository
import com.codedialer.secretcode.Domain.Model.SecretCode

class ToggleFavoriteUseCase(private val repo: CodeRepository) {
    suspend operator fun invoke(code: SecretCode) = repo.toggleFavorite(code)
}
