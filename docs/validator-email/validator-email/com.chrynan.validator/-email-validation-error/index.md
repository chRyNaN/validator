//[validator-email](../../../index.md)/[com.chrynan.validator](../index.md)/[EmailValidationError](index.md)

# EmailValidationError

sealed class [EmailValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) which indicates there was an issue when validating an email address.

#### Inheritors

| |
|---|
| [InputIsNull](-input-is-null/index.md) |
| [InvalidFormat](-invalid-format/index.md) |

## Types

| Name | Summary |
|---|---|
| [InputIsNull](-input-is-null/index.md) | [common]<br>object [InputIsNull](-input-is-null/index.md) : [EmailValidationError](index.md)<br>The provided input value to the [EmailValidator](../-email-validator/index.md) was null. A null value is not a valid email address. |
| [InvalidFormat](-invalid-format/index.md) | [common]<br>object [InvalidFormat](-invalid-format/index.md) : [EmailValidationError](index.md)<br>The provided input value to the [EmailValidator](../-email-validator/index.md) was not in a valid email address format. |

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [common]<br>open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
