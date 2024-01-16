//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[ValidationErrorNotFoundException](index.md)

# ValidationErrorNotFoundException

[common]\
class [ValidationErrorNotFoundException](index.md)(error: [ValidationError](../-validation-error/index.md)) : [ValidationException](../-validation-exception/index.md)

A [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) that indicates there was an error asserting that a [ValidationResult](../-validation-result/index.md) contained a [ValidationError](../-validation-error/index.md).

This exception is thrown from the [assertContains](../assert-contains.md) function.

## Constructors

| | |
|---|---|
| [ValidationErrorNotFoundException](-validation-error-not-found-exception.md) | [common]<br>constructor(error: [ValidationError](../-validation-error/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [cause](../-validation-exception/index.md#-654012527%2FProperties%2F-1229085388) | [common]<br>open val [cause](../-validation-exception/index.md#-654012527%2FProperties%2F-1229085388): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [details](../-validation-exception/details.md) | [common]<br>open override val [details](../-validation-exception/details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Detailed information about what this [ValidationError](../-validation-error/index.md) represents and what error occurred. |
| [errors](../-validation-exception/errors.md) | [common]<br>val [errors](../-validation-exception/errors.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ValidationError](../-validation-error/index.md)&gt; |
| [message](../-validation-exception/index.md#1824300659%2FProperties%2F-1229085388) | [common]<br>open val [message](../-validation-exception/index.md#1824300659%2FProperties%2F-1229085388): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
