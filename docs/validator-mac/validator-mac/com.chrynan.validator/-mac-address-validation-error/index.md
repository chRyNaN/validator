//[validator-mac](../../../index.md)/[com.chrynan.validator](../index.md)/[MacAddressValidationError](index.md)



# MacAddressValidationError  
 [common] sealed class [MacAddressValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating a MAC Address with the [MacAddressValidator](../-mac-address-validator/index.md).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/MacAddressValidationError.InputIsNull///PointingToDeclaration/"></a>[InputIsNull](-input-is-null/index.md)| <a name="com.chrynan.validator/MacAddressValidationError.InputIsNull///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InputIsNull](-input-is-null/index.md) : [MacAddressValidationError](index.md)  <br>More info  <br>The provided input value to the [MacAddressValidator](../-mac-address-validator/index.md) was null.  <br><br><br>|
| <a name="com.chrynan.validator/MacAddressValidationError.InvalidFormat///PointingToDeclaration/"></a>[InvalidFormat](-invalid-format/index.md)| <a name="com.chrynan.validator/MacAddressValidationError.InvalidFormat///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InvalidFormat](-invalid-format/index.md) : [MacAddressValidationError](index.md)  <br>More info  <br>The provided input value to the [MacAddressValidator](../-mac-address-validator/index.md) was not in a valid MAC Address format.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/MacAddressValidationError/details/#/PointingToDeclaration/"></a>[details](details.md)| <a name="com.chrynan.validator/MacAddressValidationError/details/#/PointingToDeclaration/"></a> [common] open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.validator/MacAddressValidationError.InputIsNull///PointingToDeclaration/"></a>[MacAddressValidationError](-input-is-null/index.md)|
| <a name="com.chrynan.validator/MacAddressValidationError.InvalidFormat///PointingToDeclaration/"></a>[MacAddressValidationError](-invalid-format/index.md)|

