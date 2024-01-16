//[validator-field](../../../index.md)/[com.chrynan.validator](../index.md)/[FieldValidationError](index.md)

# FieldValidationError

[common]\
interface [FieldValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) for a particular field on an object. This could be useful to retain information about which fields failed validation.

## Properties

| Name | Summary |
|---|---|
| [details](index.md#-1374390620%2FProperties%2F-155168089) | [common]<br>abstract val [details](index.md#-1374390620%2FProperties%2F-155168089): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [field](field.md) | [common]<br>abstract val [field](field.md): [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)&lt;*&gt;<br>The [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html) representing the field that caused this [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md). |
