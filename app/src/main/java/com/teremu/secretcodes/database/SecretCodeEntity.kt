@Entity(tableName = "secret_codes")
data class SecretCodeEntity(
    @PrimaryKey(auto-generate = true) val id: Int = 0,
    val code: String,
    val description: String,
    val category: String,
    val isDangerous: Boolean = false,
    val isFavorite: Boolean = false
)
