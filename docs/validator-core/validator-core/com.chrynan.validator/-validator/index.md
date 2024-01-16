//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[Validator](index.md)

# Validator

[common]\
interface [Validator](index.md)&lt;[T](index.md), [R](index.md)&gt;

A [Validator](index.md) performs validation on an input type of [T](index.md) and returns a [ValidationResult](../-validation-result/index.md) of type [R](index.md). This validation process determines whether the provided input to the [validate](validate.md) function matches an expected format criteria. If the validation process passes, then a [ValidationResult.Valid](../-validation-result/-valid/index.md) should be returned. Otherwise, a [ValidationResult.Invalid](../-validation-result/-invalid/index.md) should be returned.

## Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | [common]<br>open operator fun [invoke](invoke.md)(input: [T](index.md)): [ValidationResult](../-validation-result/index.md)&lt;[R](index.md)&gt;<br>A convenience function that delegates to the [validate](validate.md) function. This allows executing a [Validator](index.md) like a function. For example, emailValidator(input) instead of emailValidator.validate(input). It is up to the developer which approach should be used. |
| [validate](validate.md) | [common]<br>abstract fun [validate](validate.md)(input: [T](index.md)): [ValidationResult](../-validation-result/index.md)&lt;[R](index.md)&gt;<br>A function that determines whether the provided [input](validate.md) is valid. If the provided [input](validate.md) is deemed valid, then a [ValidationResult.Valid](../-validation-result/-valid/index.md) object, wrapping the returned type, will be returned. If the provided [input](validate.md) is deemed invalid, then a [ValidationResult.Invalid](../-validation-result/-invalid/index.md) object, wrapping any [ValidationError](../-validation-error/index.md)s encountered, will be returned. |
