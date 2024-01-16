//[validator-web](../../../../index.md)/[com.chrynan.validator](../../index.md)/[UriValidationError](../index.md)/[InvalidSchemeFormat](index.md)

# InvalidSchemeFormat

[common]\
data class [InvalidSchemeFormat](index.md)(val scheme: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](../index.md)

The provided input value to the [UriValidator](../../-uri-validator/index.md) contained an invalid Scheme, meaning the input was invalid.

## Constructors

| | |
|---|---|
| [InvalidSchemeFormat](-invalid-scheme-format.md) | [common]<br>constructor(scheme: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [details](../details.md) | [common]<br>open override val [details](../details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [scheme](scheme.md) | [common]<br>val [scheme](scheme.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
