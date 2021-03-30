//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[Validator](index.md)



# Validator  
 [common] interface [Validator](index.md)<[T](index.md), [R](index.md)>

A [Validator](index.md) performs validation on an input type of [T](index.md) and returns a [ValidationResult](../-validation-result/index.md) of type [R](index.md). This validation process determines whether the provided input to the [validate](validate.md) function matches an expected format criteria. If the validation process passes, then a [ValidationResult.Valid](../-validation-result/-valid/index.md) should be returned. Otherwise, a [ValidationResult.Invalid](../-validation-result/-invalid/index.md) should be returned.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/Validator/invoke/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[invoke](invoke.md)| <a name="com.chrynan.validator/Validator/invoke/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [invoke](invoke.md)(input: [T](index.md)): [ValidationResult](../-validation-result/index.md)<[R](index.md)>  <br>More info  <br>A convenience function that delegates to the [validate](validate.md) function.  <br><br><br>|
| <a name="com.chrynan.validator/Validator/validate/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[validate](validate.md)| <a name="com.chrynan.validator/Validator/validate/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [validate](validate.md)(input: [T](index.md)): [ValidationResult](../-validation-result/index.md)<[R](index.md)>  <br>More info  <br>A function that determines whether the provided [input](validate.md) is valid.  <br><br><br>|

