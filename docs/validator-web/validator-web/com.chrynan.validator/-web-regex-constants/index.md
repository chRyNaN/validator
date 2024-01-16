//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[WebRegexConstants](index.md)

# WebRegexConstants

[common]\
object [WebRegexConstants](index.md)

## Properties

| Name | Summary |
|---|---|
| [AUTOLINK_WEB_URL](-a-u-t-o-l-i-n-k_-w-e-b_-u-r-l.md) | [common]<br>const val [AUTOLINK_WEB_URL](-a-u-t-o-l-i-n-k_-w-e-b_-u-r-l.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Regular expression pattern to match IRIs. If a string starts with http(s):// the expression tries to match the URL structure with a relaxed rule for TLDs. If the string does not start with http(s):// the TLDs are expected to be one of the known TLDs. |
| [IP_ADDRESS](-i-p_-a-d-d-r-e-s-s.md) | [common]<br>const val [IP_ADDRESS](-i-p_-a-d-d-r-e-s-s.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [IPV6_ADDRESS](-i-p-v6_-a-d-d-r-e-s-s.md) | [common]<br>const val [IPV6_ADDRESS](-i-p-v6_-a-d-d-r-e-s-s.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Regex for an IPv6 Address. |
| [WEB_URL](-w-e-b_-u-r-l.md) | [common]<br>const val [WEB_URL](-w-e-b_-u-r-l.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Regular expression pattern to match most part of RFC 3987 Internationalized URLs, aka IRIs. |
