//[validator-core](../../../index.md)/[com.chrynan.validator](../index.md)/[ValidationResult](index.md)



# ValidationResult  
 [common] sealed class [ValidationResult](index.md)<[T](index.md)>

Represents the result of a [Validator.validate](../-validator/validate.md) function call. This could either be a [Valid](-valid/index.md) or [Invalid](-invalid/index.md) result.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/ValidationResult.Invalid///PointingToDeclaration/"></a>[Invalid](-invalid/index.md)| <a name="com.chrynan.validator/ValidationResult.Invalid///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Invalid](-invalid/index.md)<[T](-invalid/index.md)> : [ValidationResult](index.md)<[T](-invalid/index.md)>   <br>More info  <br>A [ValidationResult](index.md) that indicates that the provided input to a [Validator.validate](../-validator/validate.md) function was considered invalid, or that the validation was considered unsuccessful.  <br><br><br>|
| <a name="com.chrynan.validator/ValidationResult.Valid///PointingToDeclaration/"></a>[Valid](-valid/index.md)| <a name="com.chrynan.validator/ValidationResult.Valid///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [Valid](-valid/index.md)<[T](-valid/index.md)> : [ValidationResult](index.md)<[T](-valid/index.md)>   <br>More info  <br>A [ValidationResult](index.md) that indicates that the provided input to a [Validator.validate](../-validator/validate.md) function was considered valid, or that the validation was considered successful.  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.validator/ValidationResult.Valid///PointingToDeclaration/"></a>[ValidationResult](-valid/index.md)|
| <a name="com.chrynan.validator/ValidationResult.Invalid///PointingToDeclaration/"></a>[ValidationResult](-invalid/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator//assertContains/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.validator.ValidationError/PointingToDeclaration/"></a>[assertContains](../assert-contains.md)| <a name="com.chrynan.validator//assertContains/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.validator.ValidationError/PointingToDeclaration/"></a>[common]  <br>Content  <br>inline fun <[T](../assert-contains.md)> [ValidationResult](index.md)<[T](../assert-contains.md)>.[assertContains](../assert-contains.md)(error: [ValidationError](../-validation-error/index.md))  <br>More info  <br>Asserts that this [ValidationResult](index.md) contains the provided [error](../assert-contains.md).  <br><br><br>|
| <a name="com.chrynan.validator//contains/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.validator.ValidationError/PointingToDeclaration/"></a>[contains](../contains.md)| <a name="com.chrynan.validator//contains/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#com.chrynan.validator.ValidationError/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun <[T](../contains.md)> [ValidationResult](index.md)<[T](../contains.md)>.[contains](../contains.md)(error: [ValidationError](../-validation-error/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether this [ValidationResult](index.md) contains the provided [error](../contains.md).  <br><br><br>|
| <a name="com.chrynan.validator//isInvalid/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[isInvalid](../is-invalid.md)| <a name="com.chrynan.validator//isInvalid/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val <[T](../is-invalid.md)> [ValidationResult](index.md)<[T](../is-invalid.md)>.[isInvalid](../is-invalid.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether this [ValidationResult](index.md) is a [ValidationResult.Invalid](-invalid/index.md) class.  <br><br><br>|
| <a name="com.chrynan.validator//isValid/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[isValid](../is-valid.md)| <a name="com.chrynan.validator//isValid/com.chrynan.validator.ValidationResult[TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val <[T](../is-valid.md)> [ValidationResult](index.md)<[T](../is-valid.md)>.[isValid](../is-valid.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether this [ValidationResult](index.md) is a [ValidationResult.Valid](-valid/index.md) class.  <br><br><br>|

