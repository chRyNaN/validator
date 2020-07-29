package com.chrynan.validator

/**
 * A [ValidationError] that can occur when validating an IP Address with the [IpAddressValidator].
 */
sealed class IpAddressValidationError(override val details: String? = null) : ValidationError {

    /**
     * The provided input value to the [IpAddressValidator] was null. A null value is not a valid IP Address.
     */
    object InputIsNull : IpAddressValidationError(details = "Input is not a valid IP Address because it is null.")

    /**
     * The provided input value to the [IpAddressValidator] was not in a valid IP address format.
     */
    object InvalidFormat : IpAddressValidationError(details = "Input is not in a valid IP Address Format.")
}