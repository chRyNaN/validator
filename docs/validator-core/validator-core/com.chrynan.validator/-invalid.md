//[validator-core](../../index.md)/[com.chrynan.validator](index.md)/[Invalid](-invalid.md)



# Invalid  
[common]  
Content  
fun <[T](-invalid.md)> [Invalid](-invalid.md)(errors: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ValidationError](-validation-error/index.md)>): [ValidationResult.Invalid](-validation-result/-invalid/index.md)<[T](-invalid.md)>  
More info  


A convenience function that creates an [ValidationResult.Invalid](-validation-result/-invalid/index.md) class with the provided [errors](-invalid.md). This function just delegates to the [ValidationResult.Valid](-validation-result/-valid/index.md) constructor.

  


[common]  
Content  
fun <[T](-invalid.md)> [Invalid](-invalid.md)(vararg errors: [ValidationError](-validation-error/index.md)): [ValidationResult.Invalid](-validation-result/-invalid/index.md)<[T](-invalid.md)>  
More info  


A convenience function that creates an [ValidationResult.Invalid](-validation-result/-invalid/index.md) class with a vararg number of [ValidationError](-validation-error/index.md)s. This function just delegates to the [ValidationResult.Invalid](-validation-result/-invalid/index.md) constructor with the vararg parameters as a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html).

  



