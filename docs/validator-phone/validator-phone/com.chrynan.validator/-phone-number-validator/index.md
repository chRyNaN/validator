//[validator-phone](../../../index.md)/[com.chrynan.validator](../index.md)/[PhoneNumberValidator](index.md)

# PhoneNumberValidator

[common]\
class [PhoneNumberValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that determines whether a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is in a valid Phone Number format.

Note that this should support US and Global Phone Numbers with the hyphen (-) and decimal point (.) delimiters, as well, as no delimiters, and with an optional starting plus (+).

This [PhoneNumberValidator](index.md) provides a reasonable verification of whether a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input looks like a Phone Number. But there may be some instances where this validation fails.

Note that this [PhoneNumberValidator](index.md) doesn't determine whether a Phone Number is registered or not.

## Constructors

| | |
|---|---|
| [PhoneNumberValidator](-phone-number-validator.md) | [common]<br>constructor() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](index.md#652177886%2FFunctions%2F-395859685) | [common]<br>open operator fun [invoke](index.md#652177886%2FFunctions%2F-395859685)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [validate](validate.md) | [common]<br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
