package core.domain.service

import core.domain.value.PhoneNumber

interface DialerRulesEngine {
    fun canDial(number: PhoneNumber): Boolean
}
