//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[Validator](index.md)/[invoke](invoke.md)



# invoke  
[common]  
Content  
open operator fun [invoke](invoke.md)(input: [T](index.md)): [ValidationResult](../-validation-result/index.md)<[R](index.md)>  
More info  


A convenience function that delegates to the [validate](validate.md) function. This allows executing a [Validator](index.md) like a function. For example, emailValidator(input) instead of emailValidator.validate(input). It is up to the developer which approach should be used.

  



