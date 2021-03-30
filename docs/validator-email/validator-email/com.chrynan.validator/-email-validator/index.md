//[validator-email](../../../index.md)/[com.chrynan.validator](../index.md)/[EmailValidator](index.md)



# EmailValidator  
 [common] class [EmailValidator](index.md) : [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)> 

A [Validator](../../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that determines if the provided nullable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value is in a valid email address format. This [EmailValidator](index.md) uses the [RFC5322](https://www.ietf.org/rfc/rfc5322.txt) specification for validating the email address format. Note RFC5322 supersedes [RFC822](https://tools.ietf.org/html/rfc822).



Note that this [EmailValidator](index.md) just checks the format of the provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) is correct, it does not determine if the email address is existing or owned by a User.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.validator/EmailValidator/EmailValidator/#/PointingToDeclaration/"></a>[EmailValidator](-email-validator.md)| <a name="com.chrynan.validator/EmailValidator/EmailValidator/#/PointingToDeclaration/"></a> [common] fun [EmailValidator](-email-validator.md)()   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/EmailValidator.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.validator/EmailValidator.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[invoke](index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F981275410)| <a name="com.chrynan.validator/Validator/invoke/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [invoke](index.md#%5Bcom.chrynan.validator%2FValidator%2Finvoke%2F%23kotlin.String%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F981275410)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>|
| <a name="com.chrynan.validator/EmailValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[validate](validate.md)| <a name="com.chrynan.validator/EmailValidator/validate/#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [validate](validate.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [ValidationResult](../../../../validator-core/validator-core/com.chrynan.validator/-validation-result/index.md)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br>More info  <br>Determines if the provided [input](validate.md) is in a valid email address format.  <br><br><br>|

