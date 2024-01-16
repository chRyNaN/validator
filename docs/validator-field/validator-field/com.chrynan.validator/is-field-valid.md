//[validator-field](../../index.md)/[com.chrynan.validator](index.md)/[isFieldValid](is-field-valid.md)

# isFieldValid

[common]\
fun &lt;[T](is-field-valid.md)&gt; [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[T](is-field-valid.md)&gt;.[isFieldValid](is-field-valid.md)(field: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)&lt;*&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Determines whether the provided [field](is-field-valid.md) is valid. The provided [field](is-field-valid.md) is valid if this [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md) is [ValidationResult.Valid](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/-valid/index.md) (meaning all fields are valid), or if this [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md) is [ValidationResult.Invalid](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/-invalid/index.md) and does not contain a [FieldValidationError](-field-validation-error/index.md) for the provided [field](is-field-valid.md).
