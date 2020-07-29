package com.chrynan.validator

class IpAddressValidator : Validator<String?, String> {

    companion object {

        private val IP_ADDRESS_REGEX = Regex(WebRegexConstants.IP_ADDRESS)
    }

    override fun validate(input: String?): ValidationResult<String> {
        if (input == null) return Invalid(IpAddressValidationError.InputIsNull)

        if (!input.matches(IP_ADDRESS_REGEX)) return Invalid(IpAddressValidationError.InvalidFormat)

        return Valid(input)
    }
}