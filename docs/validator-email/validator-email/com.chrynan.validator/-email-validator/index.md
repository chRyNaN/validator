//[validator-email](../../../index.md)/[com.chrynan.validator](../index.md)/[EmailValidator](index.md)

# EmailValidator

[common]\
class [EmailValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that determines if the provided nullable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value is in a valid email address format. This [EmailValidator](index.md) uses the [RFC5322](https://www.ietf.org/rfc/rfc5322.txt) specification for validating the email address format. Note RFC5322 supersedes [RFC822](https://tools.ietf.org/html/rfc822).

Note that this [EmailValidator](index.md) just checks the format of the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) is correct, it does not determine if the email address is existing or owned by a User.

## Constructors

| | |
|---|---|
| [EmailValidator](-email-validator.md) | [common]<br>constructor() |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](index.md#652177886%2FFunctions%2F-348615095) | [common]<br>open operator fun [invoke](index.md#652177886%2FFunctions%2F-348615095)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [validate](validate.md) | [common]<br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Determines if the provided [input](validate.md) is in a valid email address format. |
