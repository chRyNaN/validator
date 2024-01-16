//[validator-phone](../../../index.md)/[com.chrynan.validator](../index.md)/[PhoneNumberValidationError](index.md)

# PhoneNumberValidationError

sealed class [PhoneNumberValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating a Phone Number with the [PhoneNumberValidator](../-phone-number-validator/index.md).

#### Inheritors

| |
|---|
| [InputIsNull](-input-is-null/index.md) |
| [InvalidFormat](-invalid-format/index.md) |

## Types

| Name | Summary |
|---|---|
| [InputIsNull](-input-is-null/index.md) | [common]<br>object [InputIsNull](-input-is-null/index.md) : [PhoneNumberValidationError](index.md)<br>The provided input value to the [PhoneNumberValidator](../-phone-number-validator/index.md) was null. A null value is not a valid Phone Number. |
| [InvalidFormat](-invalid-format/index.md) | [common]<br>object [InvalidFormat](-invalid-format/index.md) : [PhoneNumberValidationError](index.md)<br>The provided input value to the [PhoneNumberValidator](../-phone-number-validator/index.md) was not in a valid Phone Number format. |

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [common]<br>open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
