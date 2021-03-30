//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[UriValidationError](index.md)



# UriValidationError  
 [common] sealed class [UriValidationError](index.md) : [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md)

A [ValidationError](../../../../validator-core/validator-core/com.chrynan.validator/-validation-error/index.md) that can occur when validating a URI with [UriValidator](../-uri-validator/index.md).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/UriValidationError.FirstPathSegmentContainsColon///PointingToDeclaration/"></a>[FirstPathSegmentContainsColon](-first-path-segment-contains-colon/index.md)| <a name="com.chrynan.validator/UriValidationError.FirstPathSegmentContainsColon///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [FirstPathSegmentContainsColon](-first-path-segment-contains-colon/index.md) : [UriValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.InputIsBlank///PointingToDeclaration/"></a>[InputIsBlank](-input-is-blank/index.md)| <a name="com.chrynan.validator/UriValidationError.InputIsBlank///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InputIsBlank](-input-is-blank/index.md) : [UriValidationError](index.md)  <br>More info  <br>The provided input value to the [UriValidator](../-uri-validator/index.md) was blank.  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.InputIsNull///PointingToDeclaration/"></a>[InputIsNull](-input-is-null/index.md)| <a name="com.chrynan.validator/UriValidationError.InputIsNull///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [InputIsNull](-input-is-null/index.md) : [UriValidationError](index.md)  <br>More info  <br>The provided input value to the [UriValidator](../-uri-validator/index.md) was null.  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.InvalidCharactersUsed///PointingToDeclaration/"></a>[InvalidCharactersUsed](-invalid-characters-used/index.md)| <a name="com.chrynan.validator/UriValidationError.InvalidCharactersUsed///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [InvalidCharactersUsed](-invalid-characters-used/index.md)(**characters**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.InvalidIpv6Host///PointingToDeclaration/"></a>[InvalidIpv6Host](-invalid-ipv6-host/index.md)| <a name="com.chrynan.validator/UriValidationError.InvalidIpv6Host///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [InvalidIpv6Host](-invalid-ipv6-host/index.md)(**host**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.InvalidPathStart///PointingToDeclaration/"></a>[InvalidPathStart](-invalid-path-start/index.md)| <a name="com.chrynan.validator/UriValidationError.InvalidPathStart///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [InvalidPathStart](-invalid-path-start/index.md)(**characters**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.InvalidSchemeFormat///PointingToDeclaration/"></a>[InvalidSchemeFormat](-invalid-scheme-format/index.md)| <a name="com.chrynan.validator/UriValidationError.InvalidSchemeFormat///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [InvalidSchemeFormat](-invalid-scheme-format/index.md)(**scheme**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md)  <br>More info  <br>The provided input value to the [UriValidator](../-uri-validator/index.md) contained an invalid Scheme, meaning the input was invalid.  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.InvalidTextBetweenHostAndPort///PointingToDeclaration/"></a>[InvalidTextBetweenHostAndPort](-invalid-text-between-host-and-port/index.md)| <a name="com.chrynan.validator/UriValidationError.InvalidTextBetweenHostAndPort///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [InvalidTextBetweenHostAndPort](-invalid-text-between-host-and-port/index.md)(**text**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.MissingSchemeSeparator///PointingToDeclaration/"></a>[MissingSchemeSeparator](-missing-scheme-separator/index.md)| <a name="com.chrynan.validator/UriValidationError.MissingSchemeSeparator///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [MissingSchemeSeparator](-missing-scheme-separator/index.md) : [UriValidationError](index.md)  <br>More info  <br>The provided input value to the [UriValidator](../-uri-validator/index.md) did not contain a Scheme separator (':').  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.PathIsBlank///PointingToDeclaration/"></a>[PathIsBlank](-path-is-blank/index.md)| <a name="com.chrynan.validator/UriValidationError.PathIsBlank///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [PathIsBlank](-path-is-blank/index.md) : [UriValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.PortIsNotANumber///PointingToDeclaration/"></a>[PortIsNotANumber](-port-is-not-a-number/index.md)| <a name="com.chrynan.validator/UriValidationError.PortIsNotANumber///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [PortIsNotANumber](-port-is-not-a-number/index.md)(**port**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [UriValidationError](index.md)  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.SchemeIsBlank///PointingToDeclaration/"></a>[SchemeIsBlank](-scheme-is-blank/index.md)| <a name="com.chrynan.validator/UriValidationError.SchemeIsBlank///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [SchemeIsBlank](-scheme-is-blank/index.md) : [UriValidationError](index.md)  <br>More info  <br>The provided input value to the [UriValidator](../-uri-validator/index.md) contained a blank or empty Scheme which is invalid.  <br><br><br>|
| <a name="com.chrynan.validator/UriValidationError.SchemeStartsWithInvalidCharacter///PointingToDeclaration/"></a>[SchemeStartsWithInvalidCharacter](-scheme-starts-with-invalid-character/index.md)| <a name="com.chrynan.validator/UriValidationError.SchemeStartsWithInvalidCharacter///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [SchemeStartsWithInvalidCharacter](-scheme-starts-with-invalid-character/index.md) : [UriValidationError](index.md)  <br>More info  <br>The provided input value to the [UriValidator](../-uri-validator/index.md) contained a Scheme that did not begin with a letter which is invalid.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.validator/UriValidationError/details/#/PointingToDeclaration/"></a>[details](details.md)| <a name="com.chrynan.validator/UriValidationError/details/#/PointingToDeclaration/"></a> [common] open override val [details](details.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.validator/UriValidationError.InputIsNull///PointingToDeclaration/"></a>[UriValidationError](-input-is-null/index.md)|
| <a name="com.chrynan.validator/UriValidationError.InputIsBlank///PointingToDeclaration/"></a>[UriValidationError](-input-is-blank/index.md)|
| <a name="com.chrynan.validator/UriValidationError.SchemeIsBlank///PointingToDeclaration/"></a>[UriValidationError](-scheme-is-blank/index.md)|
| <a name="com.chrynan.validator/UriValidationError.MissingSchemeSeparator///PointingToDeclaration/"></a>[UriValidationError](-missing-scheme-separator/index.md)|
| <a name="com.chrynan.validator/UriValidationError.SchemeStartsWithInvalidCharacter///PointingToDeclaration/"></a>[UriValidationError](-scheme-starts-with-invalid-character/index.md)|
| <a name="com.chrynan.validator/UriValidationError.InvalidSchemeFormat///PointingToDeclaration/"></a>[UriValidationError](-invalid-scheme-format/index.md)|
| <a name="com.chrynan.validator/UriValidationError.InvalidCharactersUsed///PointingToDeclaration/"></a>[UriValidationError](-invalid-characters-used/index.md)|
| <a name="com.chrynan.validator/UriValidationError.PortIsNotANumber///PointingToDeclaration/"></a>[UriValidationError](-port-is-not-a-number/index.md)|
| <a name="com.chrynan.validator/UriValidationError.InvalidTextBetweenHostAndPort///PointingToDeclaration/"></a>[UriValidationError](-invalid-text-between-host-and-port/index.md)|
| <a name="com.chrynan.validator/UriValidationError.InvalidIpv6Host///PointingToDeclaration/"></a>[UriValidationError](-invalid-ipv6-host/index.md)|
| <a name="com.chrynan.validator/UriValidationError.PathIsBlank///PointingToDeclaration/"></a>[UriValidationError](-path-is-blank/index.md)|
| <a name="com.chrynan.validator/UriValidationError.InvalidPathStart///PointingToDeclaration/"></a>[UriValidationError](-invalid-path-start/index.md)|
| <a name="com.chrynan.validator/UriValidationError.FirstPathSegmentContainsColon///PointingToDeclaration/"></a>[UriValidationError](-first-path-segment-contains-colon/index.md)|

