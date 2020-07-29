package com.chrynan.validator

/**
 * A [ValidationError] that can occur when validating a MAC Address with the [MacAddressValidator].
 */
sealed class MacAddressValidationError(override val details: String? = null) : ValidationError {

    /**
     * The provided input value to the [MacAddressValidator] was null. A null value is not a valid MAC Address.
     */
    object InputIsNull : MacAddressValidationError(details = "Input is not a valid MAC Address because it is null.")

    /**
     * The provided input value to the [MacAddressValidator] was not in a valid MAC Address format.
     */
    object InvalidFormat : MacAddressValidationError(details = "Input is not in a valid MAC Address Format.")
}