//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[UrlValidationError](index.md)



# UrlValidationError  
 [common] sealed class [UrlValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating a URL with the [UrlValidator](../-url-validator/index.md).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/UrlValidationError.InputIsNull///PointingToDeclaration/"></a>[InputIsNull](-input-is-null/index.md)| <a name="com.chrynan.validator/UrlValidationError.InputIsNull///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InputIsNull](-input-is-null/index.md) : [UrlValidationError](index.md)  <br>More info  <br>The provided input value to the [UrlValidator](../-url-validator/index.md) was null.  <br><br><br>|
| <a name="com.chrynan.validator/UrlValidationError.InvalidFormat///PointingToDeclaration/"></a>[InvalidFormat](-invalid-format/index.md)| <a name="com.chrynan.validator/UrlValidationError.InvalidFormat///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InvalidFormat](-invalid-format/index.md) : [UrlValidationError](index.md)  <br>More info  <br>The provided input value to the [UrlValidator](../-url-validator/index.md) was not in a valid URL format.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/UrlValidationError/details/#/PointingToDeclaration/"></a>[details](details.md)| <a name="com.chrynan.validator/UrlValidationError/details/#/PointingToDeclaration/"></a> [common] open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.validator/UrlValidationError.InputIsNull///PointingToDeclaration/"></a>[UrlValidationError](-input-is-null/index.md)|
| <a name="com.chrynan.validator/UrlValidationError.InvalidFormat///PointingToDeclaration/"></a>[UrlValidationError](-invalid-format/index.md)|

