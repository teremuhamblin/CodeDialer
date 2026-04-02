package core.domain.usecase

import core.domain.repository.FavoritesRepository

class GetFavoritesUseCase(
    private val repository: FavoritesRepository
) {
    suspend operator fun invoke() = repository.getFavorites()
}
