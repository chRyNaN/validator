//[validator-email](../../../index.md)/[com.chrynan.validator](../index.md)/[EmailValidator](index.md)/[validate](validate.md)



# validate  
[common]  
Content  
open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  
More info  


Determines if the provided [input](validate.md) is in a valid email address format.



If null is provided, then [ValidationResult.Invalid](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/-invalid/index.md) will be returned with an [EmailValidationError.InputIsNull](../-email-validation-error/-input-is-null/index.md) error. If the format does not match the valid email address format, then [ValidationResult.Invalid](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/-invalid/index.md) will be returned with an [EmailValidationError.InvalidFormat](../-email-validation-error/-invalid-format/index.md) error. Otherwise, [ValidationResult.Valid](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/-valid/index.md) will be returned with the non-null [input](validate.md) value.

  



