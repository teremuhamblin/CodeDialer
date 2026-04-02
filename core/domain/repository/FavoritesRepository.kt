package core.domain.repository

import core.domain.model.Contact

interface FavoritesRepository {
    suspend fun getFavorites(): List<Contact>
}
