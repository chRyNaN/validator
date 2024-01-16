//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[Validator](index.md)/[validate](validate.md)

# validate

[common]\
abstract fun [validate](validate.md)(input: [T](index.md)): [ValidationResult](../-validation-result/index.md)&lt;[R](index.md)&gt;

A function that determines whether the provided [input](validate.md) is valid. If the provided [input](validate.md) is deemed valid, then a [ValidationResult.Valid](../-validation-result/-valid/index.md) object, wrapping the returned type, will be returned. If the provided [input](validate.md) is deemed invalid, then a [ValidationResult.Invalid](../-validation-result/-invalid/index.md) object, wrapping any [ValidationError](../-validation-error/index.md)s encountered, will be returned.
