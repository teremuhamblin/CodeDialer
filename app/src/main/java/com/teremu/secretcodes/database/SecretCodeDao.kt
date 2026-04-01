@Query("SELECT * FROM secret_codes WHERE isFavorite = 1 ORDER BY id ASC")
suspend fun getFavorites(): List<SecretCodeEntity>

@Query("UPDATE secret_codes SET isFavorite = :state WHERE id = :id")
suspend fun updateFavorite(id: Int, state: Boolean)
