package core.domain.value

@JvmInline
value class PhoneNumber private constructor(val value: String) {
    companion object {
        fun create(raw: String): PhoneNumber {
            val cleaned = raw.filter { it.isDigit() }
            require(cleaned.length in 6..15) { "Invalid phone number" }
            return PhoneNumber(cleaned)
        }
    }
}
