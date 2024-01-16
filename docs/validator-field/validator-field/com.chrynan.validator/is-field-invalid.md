//[validator-field](../../index.md)/[com.chrynan.validator](index.md)/[isFieldInvalid](is-field-invalid.md)

# isFieldInvalid

[common]\
fun &lt;[T](is-field-invalid.md)&gt; [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)&lt;[T](is-field-invalid.md)&gt;.[isFieldInvalid](is-field-invalid.md)(field: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)&lt;*&gt;): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Determines whether the provided [field](is-field-invalid.md) is invalid. The provided [field](is-field-invalid.md) is invalid if this [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md) is [ValidationResult.Invalid](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/-invalid/index.md) and contains a [FieldValidationError](-field-validation-error/index.md) for the provided [field](is-field-invalid.md).
