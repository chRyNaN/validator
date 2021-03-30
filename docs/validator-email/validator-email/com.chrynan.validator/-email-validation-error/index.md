//[validator-email](../../../index.md)/[com.chrynan.validator](../index.md)/[EmailValidationError](index.md)



# EmailValidationError  
 [common] sealed class [EmailValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) which indicates there was an issue when validating an email address.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/EmailValidationError.InputIsNull///PointingToDeclaration/"></a>[InputIsNull](-input-is-null/index.md)| <a name="com.chrynan.validator/EmailValidationError.InputIsNull///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InputIsNull](-input-is-null/index.md) : [EmailValidationError](index.md)  <br>More info  <br>The provided input value to the [EmailValidator](../-email-validator/index.md) was null.  <br><br><br>|
| <a name="com.chrynan.validator/EmailValidationError.InvalidFormat///PointingToDeclaration/"></a>[InvalidFormat](-invalid-format/index.md)| <a name="com.chrynan.validator/EmailValidationError.InvalidFormat///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InvalidFormat](-invalid-format/index.md) : [EmailValidationError](index.md)  <br>More info  <br>The provided input value to the [EmailValidator](../-email-validator/index.md) was not in a valid email address format.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/EmailValidationError/details/#/PointingToDeclaration/"></a>[details](details.md)| <a name="com.chrynan.validator/EmailValidationError/details/#/PointingToDeclaration/"></a> [common] open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.validator/EmailValidationError.InputIsNull///PointingToDeclaration/"></a>[EmailValidationError](-input-is-null/index.md)|
| <a name="com.chrynan.validator/EmailValidationError.InvalidFormat///PointingToDeclaration/"></a>[EmailValidationError](-invalid-format/index.md)|

