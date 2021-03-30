//[validator-field](../../index.md)/[com.chrynan.validator](index.md)/[assertInvalidField](assert-invalid-field.md)



# assertInvalidField  
[common]  
Content  
inline fun <[T](assert-invalid-field.md)> [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[T](assert-invalid-field.md)>.[assertInvalidField](assert-invalid-field.md)(field: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>)  
More info  


Asserts that the provided [field](assert-invalid-field.md) is invalid in this [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md). If the provided [field](assert-invalid-field.md) is valid, then a [FieldValidationException](-field-validation-exception/index.md) will be thrown. Otherwise, the function will end normally.

  



