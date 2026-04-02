package core.domain.service

import core.domain.value.CountryCode
import core.domain.value.PhoneNumber

interface PhoneNumberFormatter {
    fun format(number: PhoneNumber, countryCode: CountryCode): String
}
