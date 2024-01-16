//[validator-web](../../../index.md)/[com.chrynan.validator](../index.md)/[WebRegexConstants](index.md)/[AUTOLINK_WEB_URL](-a-u-t-o-l-i-n-k_-w-e-b_-u-r-l.md)

# AUTOLINK_WEB_URL

[common]\
const val [AUTOLINK_WEB_URL](-a-u-t-o-l-i-n-k_-w-e-b_-u-r-l.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Regular expression pattern to match IRIs. If a string starts with http(s):// the expression tries to match the URL structure with a relaxed rule for TLDs. If the string does not start with http(s):// the TLDs are expected to be one of the known TLDs.
