//[validator-email](../../index.md)/[com.chrynan.validator](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [EmailValidationError](-email-validation-error/index.md) | [common]<br>sealed class [EmailValidationError](-email-validation-error/index.md) : [ValidationError](../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)<br>A [ValidationError](../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) which indicates there was an issue when validating an email address. |
| [EmailValidator](-email-validator/index.md) | [common]<br>class [EmailValidator](-email-validator/index.md) : [Validator](../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; <br>A [Validator](../../../validator-core/validator-core/com.chrynan.validator/-validator/index.md) that determines if the provided nullable [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value is in a valid email address format. This [EmailValidator](-email-validator/index.md) uses the [RFC5322](https://www.ietf.org/rfc/rfc5322.txt) specification for validating the email address format. Note RFC5322 supersedes [RFC822](https://tools.ietf.org/html/rfc822). |
