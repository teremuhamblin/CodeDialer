package core.domain.model

import core.domain.value.ContactName
import core.domain.value.PhoneNumber

data class Contact(
    val id: Long,
    val name: ContactName,
    val number: PhoneNumber
)
