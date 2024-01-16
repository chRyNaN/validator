//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[ValidationError](index.md)

# ValidationError

interface [ValidationError](index.md)

An error that occurred during validation in a [Validator](../-validator/index.md). These errors are provided to a [ValidationResult.Invalid](../-validation-result/-invalid/index.md) instance and returned from a [Validator.validate](../-validator/validate.md) function. This allows for specific reasons as to why validation failed.

#### Inheritors

| |
|---|
| [ValidationException](../-validation-exception/index.md) |

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [common]<br>abstract val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Detailed information about what this [ValidationError](index.md) represents and what error occurred. |
