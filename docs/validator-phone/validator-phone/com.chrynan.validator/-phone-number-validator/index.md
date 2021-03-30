//[validator-phone](../../../index.md)/[com.chrynan.validator](../index.md)/[PhoneNumberValidator](index.md)



# PhoneNumberValidator  
 [common] class [PhoneNumberValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)> 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that determines whether a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is in a valid Phone Number format.



Note that this should support US and Global Phone Numbers with the hyphen (-) and decimal point (.) delimiters, as well, as no delimiters, and with an optional starting plus (+).



This [PhoneNumberValidator](index.md) provides a reasonable verification of whether a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input looks like a Phone Number. But there may be some instances where this validation fails.



Note that this [PhoneNumberValidator](index.md) doesn't determine whether a Phone Number is registered or not.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.validator/PhoneNumberValidator/PhoneNumberValidator/#/PointingToDeclaration/"></a>[PhoneNumberValidator](-phone-number-validator.md)| <a name="com.chrynan.validator/PhoneNumberValidator/PhoneNumberValidator/#/PointingToDeclaration/"></a> [common] fun [PhoneNumberValidator](-phone-number-validator.md)()   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/PhoneNumberValidator.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.validator/PhoneNumberValidator.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[invoke](index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-214494273)| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [invoke](index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-214494273)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>|
| <a name="com.chrynan.validator/PhoneNumberValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[validate](validate.md)| <a name="com.chrynan.validator/PhoneNumberValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>|

