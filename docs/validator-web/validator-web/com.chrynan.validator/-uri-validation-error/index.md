//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[UriValidationError](index.md)

# UriValidationError

sealed class [UriValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating a URI with [UriValidator](../-uri-validator/index.md).

#### Inheritors

| |
|---|
| [InputIsNull](-input-is-null/index.md) |
| [InputIsBlank](-input-is-blank/index.md) |
| [SchemeIsBlank](-scheme-is-blank/index.md) |
| [MissingSchemeSeparator](-missing-scheme-separator/index.md) |
| [SchemeStartsWithInvalidCharacter](-scheme-starts-with-invalid-character/index.md) |
| [InvalidSchemeFormat](-invalid-scheme-format/index.md) |
| [InvalidCharactersUsed](-invalid-characters-used/index.md) |
| [PortIsNotANumber](-port-is-not-a-number/index.md) |
| [InvalidTextBetweenHostAndPort](-invalid-text-between-host-and-port/index.md) |
| [InvalidIpv6Host](-invalid-ipv6-host/index.md) |
| [PathIsBlank](-path-is-blank/index.md) |
| [InvalidPathStart](-invalid-path-start/index.md) |
| [FirstPathSegmentContainsColon](-first-path-segment-contains-colon/index.md) |

## Types

| Name | Summary |
|---|---|
| [FirstPathSegmentContainsColon](-first-path-segment-contains-colon/index.md) | [common]<br>object [FirstPathSegmentContainsColon](-first-path-segment-contains-colon/index.md) : [UriValidationError](index.md) |
| [InputIsBlank](-input-is-blank/index.md) | [common]<br>object [InputIsBlank](-input-is-blank/index.md) : [UriValidationError](index.md)<br>The provided input value to the [UriValidator](../-uri-validator/index.md) was blank. A blank value is not a valid URI. |
| [InputIsNull](-input-is-null/index.md) | [common]<br>object [InputIsNull](-input-is-null/index.md) : [UriValidationError](index.md)<br>The provided input value to the [UriValidator](../-uri-validator/index.md) was null. A null value is not a valid URI. |
| [InvalidCharactersUsed](-invalid-characters-used/index.md) | [common]<br>data class [InvalidCharactersUsed](-invalid-characters-used/index.md)(val characters: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md) |
| [InvalidIpv6Host](-invalid-ipv6-host/index.md) | [common]<br>data class [InvalidIpv6Host](-invalid-ipv6-host/index.md)(val host: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md) |
| [InvalidPathStart](-invalid-path-start/index.md) | [common]<br>data class [InvalidPathStart](-invalid-path-start/index.md)(val characters: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md) |
| [InvalidSchemeFormat](-invalid-scheme-format/index.md) | [common]<br>data class [InvalidSchemeFormat](-invalid-scheme-format/index.md)(val scheme: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md)<br>The provided input value to the [UriValidator](../-uri-validator/index.md) contained an invalid Scheme, meaning the input was invalid. |
| [InvalidTextBetweenHostAndPort](-invalid-text-between-host-and-port/index.md) | [common]<br>data class [InvalidTextBetweenHostAndPort](-invalid-text-between-host-and-port/index.md)(val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md) |
| [MissingSchemeSeparator](-missing-scheme-separator/index.md) | [common]<br>object [MissingSchemeSeparator](-missing-scheme-separator/index.md) : [UriValidationError](index.md)<br>The provided input value to the [UriValidator](../-uri-validator/index.md) did not contain a Scheme separator (':'). |
| [PathIsBlank](-path-is-blank/index.md) | [common]<br>object [PathIsBlank](-path-is-blank/index.md) : [UriValidationError](index.md) |
| [PortIsNotANumber](-port-is-not-a-number/index.md) | [common]<br>data class [PortIsNotANumber](-port-is-not-a-number/index.md)(val port: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md) |
| [SchemeIsBlank](-scheme-is-blank/index.md) | [common]<br>object [SchemeIsBlank](-scheme-is-blank/index.md) : [UriValidationError](index.md)<br>The provided input value to the [UriValidator](../-uri-validator/index.md) contained a blank or empty Scheme which is invalid. |
| [SchemeStartsWithInvalidCharacter](-scheme-starts-with-invalid-character/index.md) | [common]<br>object [SchemeStartsWithInvalidCharacter](-scheme-starts-with-invalid-character/index.md) : [UriValidationError](index.md)<br>The provided input value to the [UriValidator](../-uri-validator/index.md) contained a Scheme that did not begin with a letter which is invalid. |

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [common]<br>open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
