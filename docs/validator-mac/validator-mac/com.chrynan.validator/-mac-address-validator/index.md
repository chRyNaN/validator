//[validator-mac](../../../index.md)/[com.chrynan.validator](../index.md)/[MacAddressValidator](index.md)



# MacAddressValidator  
 [common] class [MacAddressValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)> 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that determines whether a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is in a valid MAC-48 (IEEE 802) format.



This [MacAddressValidator](index.md) considers the colon (:), hyphen (-), and decimal point (.), delimiters valid. However, the mixed use of the supported delimiters is not considered valid.



Note that this [MacAddressValidator](index.md) does not consider a delimiter-less MAC Address valid.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.validator/MacAddressValidator/MacAddressValidator/#/PointingToDeclaration/"></a>[MacAddressValidator](-mac-address-validator.md)| <a name="com.chrynan.validator/MacAddressValidator/MacAddressValidator/#/PointingToDeclaration/"></a> [common] fun [MacAddressValidator](-mac-address-validator.md)()   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/MacAddressValidator.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.validator/MacAddressValidator.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[invoke](index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-906298756)| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [invoke](index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-906298756)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>|
| <a name="com.chrynan.validator/MacAddressValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[validate](validate.md)| <a name="com.chrynan.validator/MacAddressValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>|

