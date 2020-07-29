package com.chrynan.validator

/**
 * A [ValidationError] that can occur when validating a Phone Number with the [PhoneNumberValidator].
 */
sealed class PhoneNumberValidationError(override val details: String? = null) : ValidationError {

    /**
     * The provided input value to the [PhoneNumberValidator] was null. A null value is not a valid Phone Number.
     */
    object InputIsNull : PhoneNumberValidationError(details = "Input is not a valid Phone Number because it is null.")

    /**
     * The provided input value to the [PhoneNumberValidator] was not in a valid Phone Number format.
     */
    object InvalidFormat : PhoneNumberValidationError(details = "Input is not in a valid Phone Number Format.")
}