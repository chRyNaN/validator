//[validator-core](../../../../index.md)/[com.chrynan.validator](../../index.md)/[ValidationResult](../index.md)/[Invalid](index.md)



# Invalid  
 [common] data class [Invalid](index.md)<[T](index.md)> : [ValidationResult](../index.md)<[T](index.md)> 

A [ValidationResult](../index.md) that indicates that the provided input to a [Validator.validate](../../-validator/validate.md) function was considered invalid, or that the validation was considered unsuccessful. The [errors](errors.md) property are the [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) of errors that were encountered when performing the validation.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/ValidationResult.Invalid/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.chrynan.validator/ValidationResult.Invalid/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/ValidationResult.Invalid/errors/#/PointingToDeclaration/"></a>[errors](errors.md)| <a name="com.chrynan.validator/ValidationResult.Invalid/errors/#/PointingToDeclaration/"></a> [common] val [errors](errors.md): [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[ValidationError](../../-validation-error/index.md)>   <br>|

