//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[ValidationException](index.md)

# ValidationException

open class [ValidationException](index.md) : [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html), [ValidationError](../-validation-error/index.md)

A [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) that indicates there was an error asserting that a [ValidationResult](../-validation-result/index.md) was valid or invalid.

This exception is thrown from the [assertValid](../assert-valid.md) and [assertInvalid](../assert-invalid.md) functions.

#### Inheritors

| |
|---|
| [ValidationErrorNotFoundException](../-validation-error-not-found-exception/index.md) |

## Properties

| Name | Summary |
|---|---|
| [cause](index.md#-654012527%2FProperties%2F-1229085388) | [common]<br>open val [cause](index.md#-654012527%2FProperties%2F-1229085388): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [details](details.md) | [common]<br>open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Detailed information about what this [ValidationError](../-validation-error/index.md) represents and what error occurred. |
| [errors](errors.md) | [common]<br>val [errors](errors.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ValidationError](../-validation-error/index.md)&gt; |
| [message](index.md#1824300659%2FProperties%2F-1229085388) | [common]<br>open val [message](index.md#1824300659%2FProperties%2F-1229085388): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
