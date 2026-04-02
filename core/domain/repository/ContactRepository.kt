package core.domain.repository

import core.domain.model.Contact

interface ContactsRepository {
    suspend fun search(query: String): List<Contact>
    suspend fun smartDial(input: String): List<Contact>
}
