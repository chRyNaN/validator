//[validator-core](../../../../index.md)/[com.chrynan.validator](../../index.md)/[ValidationResult](../index.md)/[Valid](index.md)

# Valid

[common]\
@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)

value class [Valid](index.md)&lt;[T](index.md)&gt; : [ValidationResult](../index.md)&lt;[T](index.md)&gt; 

A [ValidationResult](../index.md) that indicates that the provided input to a [Validator.validate](../../-validator/validate.md) function was considered valid, or that the validation was considered successful. The [value](value.md) property is the valid input for the [Validator.validate](../../-validator/validate.md) function.

## Properties

| Name | Summary |
|---|---|
| [isInvalid](../../is-invalid.md) | [common]<br>val &lt;[T](../../is-invalid.md)&gt; [ValidationResult](../index.md)&lt;[T](../../is-invalid.md)&gt;.[isInvalid](../../is-invalid.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [ValidationResult](../index.md) is a [ValidationResult.Invalid](../-invalid/index.md) class. |
| [isValid](../../is-valid.md) | [common]<br>val &lt;[T](../../is-valid.md)&gt; [ValidationResult](../index.md)&lt;[T](../../is-valid.md)&gt;.[isValid](../../is-valid.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [ValidationResult](../index.md) is a [ValidationResult.Valid](index.md) class. |
| [value](value.md) | [common]<br>val [value](value.md): [T](index.md) |

## Functions

| Name | Summary |
|---|---|
| [assertContains](../../assert-contains.md) | [common]<br>inline fun &lt;[T](../../assert-contains.md)&gt; [ValidationResult](../index.md)&lt;[T](../../assert-contains.md)&gt;.[assertContains](../../assert-contains.md)(error: [ValidationError](../../-validation-error/index.md))<br>Asserts that this [ValidationResult](../index.md) contains the provided [error](../../assert-contains.md). If this [ValidationResult](../index.md) does not contain the provided [error](../../assert-contains.md) or this [ValidationResult](../index.md) is a [ValidationResult.Valid](index.md) instance, then [ValidationErrorNotFoundException](../../-validation-error-not-found-exception/index.md) will be thrown. |
| [contains](../../contains.md) | [common]<br>operator fun &lt;[T](../../contains.md)&gt; [ValidationResult](../index.md)&lt;[T](../../contains.md)&gt;.[contains](../../contains.md)(error: [ValidationError](../../-validation-error/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [ValidationResult](../index.md) contains the provided [error](../../contains.md). If this [ValidationResult](../index.md) is a [ValidationResult.Valid](index.md) class, then this will always return false as there are no errors. |
| [toResult](../../to-result.md) | [common]<br>fun &lt;[T](../../to-result.md)&gt; [ValidationResult](../index.md)&lt;[T](../../to-result.md)&gt;.[toResult](../../to-result.md)(): [Result](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/index.html)&lt;[T](../../to-result.md)&gt;<br>Converts this [ValidationResult](../index.md) instance into a Kotlin [Result](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/index.html) instance. |
