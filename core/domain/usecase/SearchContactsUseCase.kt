package core.domain.usecase

import core.domain.repository.ContactsRepository
import core.domain.service.SearchNormalizer
import core.domain.value.SearchQuery

class SearchContactsUseCase(
    private val repository: ContactsRepository,
    private val normalizer: SearchNormalizer
) {
    suspend operator fun invoke(query: SearchQuery) =
        repository.search(normalizer.normalize(query))
}
