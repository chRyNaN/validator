//[validator-mac](../../../index.md)/[com.chrynan.validator](../index.md)/[MacAddressValidationError](index.md)

# MacAddressValidationError

sealed class [MacAddressValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating a MAC Address with the [MacAddressValidator](../-mac-address-validator/index.md).

#### Inheritors

| |
|---|
| [InputIsNull](-input-is-null/index.md) |
| [InvalidFormat](-invalid-format/index.md) |

## Types

| Name | Summary |
|---|---|
| [InputIsNull](-input-is-null/index.md) | [common]<br>object [InputIsNull](-input-is-null/index.md) : [MacAddressValidationError](index.md)<br>The provided input value to the [MacAddressValidator](../-mac-address-validator/index.md) was null. A null value is not a valid MAC Address. |
| [InvalidFormat](-invalid-format/index.md) | [common]<br>object [InvalidFormat](-invalid-format/index.md) : [MacAddressValidationError](index.md)<br>The provided input value to the [MacAddressValidator](../-mac-address-validator/index.md) was not in a valid MAC Address format. |

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [common]<br>open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
