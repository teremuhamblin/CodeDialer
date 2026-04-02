package core.domain.usecase

import core.domain.service.PhoneNumberFormatter
import core.domain.value.CountryCode
import core.domain.value.PhoneNumber

class FormatNumberUseCase(
    private val formatter: PhoneNumberFormatter
) {
    operator fun invoke(number: PhoneNumber, country: CountryCode): String =
        formatter.format(number, country)
}
