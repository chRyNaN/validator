//[validator-mac](../../../index.md)/[com.chrynan.validator](../index.md)/[MacAddressValidator](index.md)

# MacAddressValidator

[common]\
class [MacAddressValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that determines whether a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is in a valid MAC-48 (IEEE 802) format.

This [MacAddressValidator](index.md) considers the colon (:), hyphen (-), and decimal point (.), delimiters valid. However, the mixed use of the supported delimiters is not considered valid.

Note that this [MacAddressValidator](index.md) does not consider a delimiter-less MAC Address valid.

## Constructors

| | |
|---|---|
| [MacAddressValidator](-mac-address-validator.md) | [common]<br>constructor() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](index.md#652177886%2FFunctions%2F-1563437956) | [common]<br>open operator fun [invoke](index.md#652177886%2FFunctions%2F-1563437956)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [validate](validate.md) | [common]<br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
