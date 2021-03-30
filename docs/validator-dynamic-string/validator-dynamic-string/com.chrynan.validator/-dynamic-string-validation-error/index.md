//[validator-dynamic-string](../../../index.md)/[com.chrynan.validator](../index.md)/[DynamicStringValidationError](index.md)



# DynamicStringValidationError  
 [common] sealed class [DynamicStringValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/DynamicStringValidationError.BlankNotAllowed///PointingToDeclaration/"></a>[BlankNotAllowed](-blank-not-allowed/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.BlankNotAllowed///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [BlankNotAllowed](-blank-not-allowed/index.md) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.EmptyNotAllowed///PointingToDeclaration/"></a>[EmptyNotAllowed](-empty-not-allowed/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.EmptyNotAllowed///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [EmptyNotAllowed](-empty-not-allowed/index.md) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.MaxLengthExceeded///PointingToDeclaration/"></a>[MaxLengthExceeded](-max-length-exceeded/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.MaxLengthExceeded///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [MaxLengthExceeded](-max-length-exceeded/index.md)(**length**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **max**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.MinLengthNotReached///PointingToDeclaration/"></a>[MinLengthNotReached](-min-length-not-reached/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.MinLengthNotReached///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [MinLengthNotReached](-min-length-not-reached/index.md)(**length**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **min**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.MustNotBeNull///PointingToDeclaration/"></a>[MustNotBeNull](-must-not-be-null/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.MustNotBeNull///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [MustNotBeNull](-must-not-be-null/index.md) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.MustNotContainValue///PointingToDeclaration/"></a>[MustNotContainValue](-must-not-contain-value/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.MustNotContainValue///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [MustNotContainValue](-must-not-contain-value/index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.PrefixNotFound///PointingToDeclaration/"></a>[PrefixNotFound](-prefix-not-found/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.PrefixNotFound///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [PrefixNotFound](-prefix-not-found/index.md) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.RegexNotMatched///PointingToDeclaration/"></a>[RegexNotMatched](-regex-not-matched/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.RegexNotMatched///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [RegexNotMatched](-regex-not-matched/index.md) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.RequiredValueNotFound///PointingToDeclaration/"></a>[RequiredValueNotFound](-required-value-not-found/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.RequiredValueNotFound///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [RequiredValueNotFound](-required-value-not-found/index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.SuffixNotFound///PointingToDeclaration/"></a>[SuffixNotFound](-suffix-not-found/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.SuffixNotFound///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [SuffixNotFound](-suffix-not-found/index.md) : [DynamicStringValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/DynamicStringValidationError.UnsupportedCharUsed///PointingToDeclaration/"></a>[UnsupportedCharUsed](-unsupported-char-used/index.md)| <a name="com.chrynan.validator/DynamicStringValidationError.UnsupportedCharUsed///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [UnsupportedCharUsed](-unsupported-char-used/index.md)(**char**: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)) : [DynamicStringValidationError](index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/DynamicStringValidationError/details/#/PointingToDeclaration/"></a>[details](details.md)| <a name="com.chrynan.validator/DynamicStringValidationError/details/#/PointingToDeclaration/"></a> [common] open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.validator/DynamicStringValidationError.MustNotBeNull///PointingToDeclaration/"></a>[DynamicStringValidationError](-must-not-be-null/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.MinLengthNotReached///PointingToDeclaration/"></a>[DynamicStringValidationError](-min-length-not-reached/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.MaxLengthExceeded///PointingToDeclaration/"></a>[DynamicStringValidationError](-max-length-exceeded/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.RegexNotMatched///PointingToDeclaration/"></a>[DynamicStringValidationError](-regex-not-matched/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.PrefixNotFound///PointingToDeclaration/"></a>[DynamicStringValidationError](-prefix-not-found/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.SuffixNotFound///PointingToDeclaration/"></a>[DynamicStringValidationError](-suffix-not-found/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.BlankNotAllowed///PointingToDeclaration/"></a>[DynamicStringValidationError](-blank-not-allowed/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.EmptyNotAllowed///PointingToDeclaration/"></a>[DynamicStringValidationError](-empty-not-allowed/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.RequiredValueNotFound///PointingToDeclaration/"></a>[DynamicStringValidationError](-required-value-not-found/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.MustNotContainValue///PointingToDeclaration/"></a>[DynamicStringValidationError](-must-not-contain-value/index.md)|
| <a name="com.chrynan.validator/DynamicStringValidationError.UnsupportedCharUsed///PointingToDeclaration/"></a>[DynamicStringValidationError](-unsupported-char-used/index.md)|

