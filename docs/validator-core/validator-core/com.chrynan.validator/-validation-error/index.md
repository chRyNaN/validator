//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[ValidationError](index.md)



# ValidationError  
 [common] interface [ValidationError](index.md)

An error that occurred during validation in a [Validator](../-validator/index.md). These errors are provided to a [ValidationResult.Invalid](../-validation-result/-invalid/index.md) instance and returned from a [Validator.validate](../-validator/validate.md) function. This allows for specific reasons as to why validation failed.

   


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/ValidationError/details/#/PointingToDeclaration/"></a>[details](details.md)| <a name="com.chrynan.validator/ValidationError/details/#/PointingToDeclaration/"></a> [common] abstract val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?Detailed information about what this [ValidationError](index.md) represents and what error occurred.   <br>|

