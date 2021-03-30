//[validator-core](../../index.md)/[com.chrynan.validator](index.md)/[contains](contains.md)



# contains  
[common]  
Content  
operator fun <[T](contains.md)> [ValidationResult](-validation-result/index.md)<[T](contains.md)>.[contains](contains.md)(error: [ValidationError](-validation-error/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  
More info  


Determines whether this [ValidationResult](-validation-result/index.md) contains the provided [error](contains.md). If this [ValidationResult](-validation-result/index.md) is a [ValidationResult.Valid](-validation-result/-valid/index.md) class, then this will always return false as there are no errors.

  



