data class SecretCode(
    val id: Int,
    val code: String,
    val description: String,
    val category: String,
    val isDangerous: Boolean = false,
    val isFavorite: Boolean = false
)
