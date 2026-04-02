package core.domain.usecase

import core.domain.repository.ContactsRepository

class SmartDialUseCase(
    private val repository: ContactsRepository
) {
    suspend operator fun invoke(input: String) =
        repository.smartDial(input)
}
