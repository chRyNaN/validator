//[validator-dynamic-string](../../index.md)/[com.chrynan.validator](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [DynamicStringConfig](-dynamic-string-config/index.md) | [common]<br>data class [DynamicStringConfig](-dynamic-string-config/index.md) |
| [DynamicStringValidationError](-dynamic-string-validation-error/index.md) | [common]<br>sealed class [DynamicStringValidationError](-dynamic-string-validation-error/index.md) : [ValidationError](../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) |
| [DynamicStringValidator](-dynamic-string-validator/index.md) | [common]<br>class [DynamicStringValidator](-dynamic-string-validator/index.md) : [Validator](../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?&gt; |
| [InvalidDynamicStringConfigException](-invalid-dynamic-string-config-exception/index.md) | [common]<br>class [InvalidDynamicStringConfigException](-invalid-dynamic-string-config-exception/index.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), config: [DynamicStringConfig](-dynamic-string-config/index.md)? = null) : [RuntimeException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html) |
| [StringBlankSpaceType](-string-blank-space-type/index.md) | [common]<br>enum [StringBlankSpaceType](-string-blank-space-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[StringBlankSpaceType](-string-blank-space-type/index.md)&gt; |

## Functions

| Name | Summary |
|---|---|
| [dynamicStringValidator](dynamic-string-validator.md) | [common]<br>fun [dynamicStringValidator](dynamic-string-validator.md)(configBuilder: [DynamicStringConfig](-dynamic-string-config/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [DynamicStringValidator](-dynamic-string-validator/index.md) |
