//[validator-dynamic-string](../../../index.md)/[com.chrynan.validator](../index.md)/[DynamicStringValidationError](index.md)

# DynamicStringValidationError

sealed class [DynamicStringValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

#### Inheritors

| |
|---|
| [MustNotBeNull](-must-not-be-null/index.md) |
| [MinLengthNotReached](-min-length-not-reached/index.md) |
| [MaxLengthExceeded](-max-length-exceeded/index.md) |
| [RegexNotMatched](-regex-not-matched/index.md) |
| [PrefixNotFound](-prefix-not-found/index.md) |
| [SuffixNotFound](-suffix-not-found/index.md) |
| [BlankNotAllowed](-blank-not-allowed/index.md) |
| [EmptyNotAllowed](-empty-not-allowed/index.md) |
| [RequiredValueNotFound](-required-value-not-found/index.md) |
| [MustNotContainValue](-must-not-contain-value/index.md) |
| [UnsupportedCharUsed](-unsupported-char-used/index.md) |

## Types

| Name | Summary |
|---|---|
| [BlankNotAllowed](-blank-not-allowed/index.md) | [common]<br>object [BlankNotAllowed](-blank-not-allowed/index.md) : [DynamicStringValidationError](index.md) |
| [EmptyNotAllowed](-empty-not-allowed/index.md) | [common]<br>object [EmptyNotAllowed](-empty-not-allowed/index.md) : [DynamicStringValidationError](index.md) |
| [MaxLengthExceeded](-max-length-exceeded/index.md) | [common]<br>data class [MaxLengthExceeded](-max-length-exceeded/index.md)(val length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val max: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [DynamicStringValidationError](index.md) |
| [MinLengthNotReached](-min-length-not-reached/index.md) | [common]<br>data class [MinLengthNotReached](-min-length-not-reached/index.md)(val length: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val min: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [DynamicStringValidationError](index.md) |
| [MustNotBeNull](-must-not-be-null/index.md) | [common]<br>object [MustNotBeNull](-must-not-be-null/index.md) : [DynamicStringValidationError](index.md) |
| [MustNotContainValue](-must-not-contain-value/index.md) | [common]<br>data class [MustNotContainValue](-must-not-contain-value/index.md)(val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [DynamicStringValidationError](index.md) |
| [PrefixNotFound](-prefix-not-found/index.md) | [common]<br>object [PrefixNotFound](-prefix-not-found/index.md) : [DynamicStringValidationError](index.md) |
| [RegexNotMatched](-regex-not-matched/index.md) | [common]<br>object [RegexNotMatched](-regex-not-matched/index.md) : [DynamicStringValidationError](index.md) |
| [RequiredValueNotFound](-required-value-not-found/index.md) | [common]<br>data class [RequiredValueNotFound](-required-value-not-found/index.md)(val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [DynamicStringValidationError](index.md) |
| [SuffixNotFound](-suffix-not-found/index.md) | [common]<br>object [SuffixNotFound](-suffix-not-found/index.md) : [DynamicStringValidationError](index.md) |
| [UnsupportedCharUsed](-unsupported-char-used/index.md) | [common]<br>data class [UnsupportedCharUsed](-unsupported-char-used/index.md)(val char: [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)) : [DynamicStringValidationError](index.md) |

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [common]<br>open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
