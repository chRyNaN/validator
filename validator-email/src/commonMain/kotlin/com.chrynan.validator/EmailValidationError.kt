package com.chrynan.validator

/**
 * A [ValidationError] which indicates there was an issue when validating an email address.
 */
sealed class EmailValidationError(override val details: String? = null) : ValidationError {

    /**
     * The provided input value to the [EmailValidator] was null. A null value is not a valid email address.
     */
    object InputIsNull : EmailValidationError(details = "Input is not a valid Email Address because it is null.")

    /**
     * The provided input value to the [EmailValidator] was not in a valid email address format.
     */
    object InvalidFormat : EmailValidationError(details = "Input is not in a valid Email Address Format.")
}