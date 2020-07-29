package com.chrynan.validator

/**
 * A [Validator] that determines whether a [String] input is in a valid MAC-48 (IEEE 802) format.
 *
 * This [MacAddressValidator] considers the colon (:), hyphen (-), and decimal point (.), delimiters valid. However,
 * the mixed use of the supported delimiters is not considered valid.
 *
 * Note that this [MacAddressValidator] does not consider a delimiter-less MAC Address valid.
 */
class MacAddressValidator : Validator<String?, String> {

    companion object {

        private val MAC_ADDRESS_COLON_DELIMITER_REGEX = Regex("^([0-9A-Fa-f]{2}[:]){5}([0-9A-Fa-f]{2})\$")
        private val MAC_ADDRESS_HYPHEN_DELIMITER_REGEX = Regex("^([0-9A-Fa-f]{2}[-]){5}([0-9A-Fa-f]{2})\$")
        private val MAC_ADDRESS_DECIMAL_DELIMITER_REGEX = Regex("^([0-9A-Fa-f]{2}[.]){5}([0-9A-Fa-f]{2})\$")
    }

    override fun validate(input: String?): ValidationResult<String> {
        if (input == null) return Invalid(MacAddressValidationError.InputIsNull)

        if (!input.matches(MAC_ADDRESS_COLON_DELIMITER_REGEX) && !input.matches(MAC_ADDRESS_HYPHEN_DELIMITER_REGEX) && !input.matches(MAC_ADDRESS_DECIMAL_DELIMITER_REGEX)) {
            return Invalid(MacAddressValidationError.InvalidFormat)
        }

        return Valid(input)
    }
}