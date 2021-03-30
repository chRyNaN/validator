//[validator-field](../../index.md)/[com.chrynan.validator](index.md)/[assertValidField](assert-valid-field.md)



# assertValidField  
[common]  
Content  
inline fun <[T](assert-valid-field.md)> [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[T](assert-valid-field.md)>.[assertValidField](assert-valid-field.md)(field: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>)  
More info  


Asserts that the provided [field](assert-valid-field.md) is valid in this [ValidationResult](../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md). If the provided [field](assert-valid-field.md) is invalid, then a [FieldValidationException](-field-validation-exception/index.md) will be thrown. Otherwise, the function will end normally.

  



