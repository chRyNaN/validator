//[validator-phone](../../../index.md)/[com.chrynan.validator](../index.md)/[PhoneNumberValidationError](index.md)



# PhoneNumberValidationError  
 [common] sealed class [PhoneNumberValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating a Phone Number with the [PhoneNumberValidator](../-phone-number-validator/index.md).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/PhoneNumberValidationError.InputIsNull///PointingToDeclaration/"></a>[InputIsNull](-input-is-null/index.md)| <a name="com.chrynan.validator/PhoneNumberValidationError.InputIsNull///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InputIsNull](-input-is-null/index.md) : [PhoneNumberValidationError](index.md)  <br>More info  <br>The provided input value to the [PhoneNumberValidator](../-phone-number-validator/index.md) was null.  <br><br><br>|
| <a name="com.chrynan.validator/PhoneNumberValidationError.InvalidFormat///PointingToDeclaration/"></a>[InvalidFormat](-invalid-format/index.md)| <a name="com.chrynan.validator/PhoneNumberValidationError.InvalidFormat///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InvalidFormat](-invalid-format/index.md) : [PhoneNumberValidationError](index.md)  <br>More info  <br>The provided input value to the [PhoneNumberValidator](../-phone-number-validator/index.md) was not in a valid Phone Number format.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/PhoneNumberValidationError/details/#/PointingToDeclaration/"></a>[details](details.md)| <a name="com.chrynan.validator/PhoneNumberValidationError/details/#/PointingToDeclaration/"></a> [common] open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.validator/PhoneNumberValidationError.InputIsNull///PointingToDeclaration/"></a>[PhoneNumberValidationError](-input-is-null/index.md)|
| <a name="com.chrynan.validator/PhoneNumberValidationError.InvalidFormat///PointingToDeclaration/"></a>[PhoneNumberValidationError](-invalid-format/index.md)|

