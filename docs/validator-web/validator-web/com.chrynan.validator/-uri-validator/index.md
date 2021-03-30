//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[UriValidator](index.md)



# UriValidator  
 [common] class [UriValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)> 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that validates whether the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is a valid URI. This [UriValidator](index.md) attempts to validate according to the RFC-3986 specification: https://tools.ietf.org/html/rfc3986#section-3.1



Note that this [UriValidator](index.md) doesn't perform specific validation for every URI Scheme type. Instead it just tries to assert that the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input is in a generally valid URI format.



Note that this [UriValidator](index.md) does not validate relative URIs (URIs without the Scheme component).

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.validator/UriValidator/UriValidator/#/PointingToDeclaration/"></a>[UriValidator](-uri-validator.md)| <a name="com.chrynan.validator/UriValidator/UriValidator/#/PointingToDeclaration/"></a> [common] fun [UriValidator](-uri-validator.md)()   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/UriValidator.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.validator/UriValidator.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[invoke](../-url-validator/index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F164174828)| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [invoke](../-url-validator/index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F164174828)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>|
| <a name="com.chrynan.validator/UriValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[validate](validate.md)| <a name="com.chrynan.validator/UriValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>|

