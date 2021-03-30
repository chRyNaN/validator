//[validator-field](../../../index.md)/[com.chrynan.validator](../index.md)/[FieldValidationError](index.md)



# FieldValidationError  
 [common] interface [FieldValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) for a particular field on an object. This could be useful to retain information about which fields failed validation.

   


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/FieldValidationError/details/#/PointingToDeclaration/"></a>[details](index.md#%5Bcom.chrynan.validator%2FFieldValidationError%2Fdetails%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1752467176)| <a name="com.chrynan.validator/FieldValidationError/details/#/PointingToDeclaration/"></a> [common] abstract val [details](index.md#%5Bcom.chrynan.validator%2FFieldValidationError%2Fdetails%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1752467176): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>|
| <a name="com.chrynan.validator/FieldValidationError/field/#/PointingToDeclaration/"></a>[field](field.md)| <a name="com.chrynan.validator/FieldValidationError/field/#/PointingToDeclaration/"></a> [common] abstract val [field](field.md): [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>The [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html) representing the field that caused this [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md).   <br>|

