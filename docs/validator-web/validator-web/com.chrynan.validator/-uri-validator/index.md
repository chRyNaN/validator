//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[UriValidator](index.md)

# UriValidator

[common]\
class [UriValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that validates whether the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is a valid URI. This [UriValidator](index.md) attempts to validate according to the RFC-3986 specification: https://tools.ietf.org/html/rfc3986#section-3.1

Note that this [UriValidator](index.md) doesn't perform specific validation for every URI Scheme type. Instead it just tries to assert that the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is in a generally valid URI format.

Note that this [UriValidator](index.md) does not validate relative URIs (URIs without the Scheme component).

## Constructors

| | |
|---|---|
| [UriValidator](-uri-validator.md) | [common]<br>constructor() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](../-url-validator/index.md#652177886%2FFunctions%2F-1125180159) | [common]<br>open operator fun [invoke](../-url-validator/index.md#652177886%2FFunctions%2F-1125180159)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [validate](validate.md) | [common]<br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
