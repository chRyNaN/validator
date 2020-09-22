package com.chrynan.validator

/**
 * Determines whether a [String] is in a valid IPv4 Address format.
 */
class Ipv4AddressValidator : Validator<String?, String> {

    companion object {

        private val IP_ADDRESS_REGEX = Regex(WebRegexConstants.IP_ADDRESS)
    }

    override fun validate(input: String?): ValidationResult<String> {
        if (input == null) return Invalid(Ipv4AddressValidationError.InputIsNull)

        if (!input.matches(IP_ADDRESS_REGEX)) return Invalid(Ipv4AddressValidationError.InvalidFormat)

        return Valid(input)
    }
}
