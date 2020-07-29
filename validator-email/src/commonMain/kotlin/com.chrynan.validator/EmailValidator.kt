package com.chrynan.validator

/**
 * A [Validator] that determines if the provided nullable [String] value is in a valid email address format. This
 * [EmailValidator] uses the [RFC5322](https://www.ietf.org/rfc/rfc5322.txt) specification for validating the email
 * address format. Note RFC5322 supersedes [RFC822](https://tools.ietf.org/html/rfc822).
 *
 * Note that this [EmailValidator] just checks the format of the provided [String] is correct, it does not determine if
 * the email address is existing or owned by a User.
 */
class EmailValidator : Validator<String?, String> {

    companion object {

        /**
         * A valid email address [Regex] pattern. This [Regex] should conform to the RFC5322 specification.
         *
         * This [Regex] pattern was adapted from the following StackOverflow answer:
         * https://stackoverflow.com/a/201378/1478764
         */
        private val RFC_5322_REGEX = Regex("(?:[a-z0-9!#\$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#\$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    }

    /**
     * Determines if the provided [input] is in a valid email address format.
     *
     * If null is provided, then [ValidationResult.Invalid] will be returned with an [EmailValidationError.InputIsNull]
     * error. If the format does not match the valid email address format, then [ValidationResult.Invalid] will be
     * returned with an [EmailValidationError.InvalidFormat] error. Otherwise, [ValidationResult.Valid] will be
     * returned with the non-null [input] value.
     */
    override fun validate(input: String?): ValidationResult<String> {
        if (input == null) return Invalid(EmailValidationError.InputIsNull)

        if (!input.matches(RFC_5322_REGEX)) return Invalid(EmailValidationError.InvalidFormat)

        return Valid(input)
    }
}