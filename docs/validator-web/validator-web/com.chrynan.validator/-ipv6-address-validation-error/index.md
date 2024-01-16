//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[Ipv6AddressValidationError](index.md)

# Ipv6AddressValidationError

sealed class [Ipv6AddressValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating an IPv6 Address with the [Ipv6AddressValidator](../-ipv6-address-validator/index.md).

#### Inheritors

| |
|---|
| [InputIsNull](-input-is-null/index.md) |
| [InvalidFormat](-invalid-format/index.md) |

## Types

| Name | Summary |
|---|---|
| [InputIsNull](-input-is-null/index.md) | [common]<br>object [InputIsNull](-input-is-null/index.md) : [Ipv6AddressValidationError](index.md)<br>The provided input value to the [Ipv6AddressValidator](../-ipv6-address-validator/index.md) was null. A null value is not a valid IPv6 Address. |
| [InvalidFormat](-invalid-format/index.md) | [common]<br>object [InvalidFormat](-invalid-format/index.md) : [Ipv6AddressValidationError](index.md)<br>The provided input value to the [Ipv6AddressValidator](../-ipv6-address-validator/index.md) was not in a valid IPv6 address format. |

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [common]<br>open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
