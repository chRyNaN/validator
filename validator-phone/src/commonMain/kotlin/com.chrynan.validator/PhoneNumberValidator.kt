package com.chrynan.validator

/**
 * A [Validator] that determines whether a [String] input is in a valid Phone Number format.
 *
 * Note that this should support US and Global Phone Numbers with the hyphen (-) and decimal point (.) delimiters, as
 * well, as no delimiters, and with an optional starting plus (+).
 *
 * This [PhoneNumberValidator] provides a reasonable verification of whether a [String] input looks like a Phone
 * Number. But there may be some instances where this validation fails.
 *
 * Note that this [PhoneNumberValidator] doesn't determine whether a Phone Number is registered or not.
 */
class PhoneNumberValidator : Validator<String?, String> {

    companion object {

        private val PHONE_NUMBER_REGEX = Regex("[\\+]?[0-9.-]+")
    }

    override fun validate(input: String?): ValidationResult<String> {
        if (input == null) return Invalid(PhoneNumberValidationError.InputIsNull)

        if (!input.matches(PHONE_NUMBER_REGEX)) return Invalid(PhoneNumberValidationError.InvalidFormat)

        return Valid(input)
    }
}