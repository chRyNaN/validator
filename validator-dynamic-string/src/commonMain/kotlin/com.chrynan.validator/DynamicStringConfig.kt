package com.chrynan.validator

data class DynamicStringConfig internal constructor(
        val minLength: Int? = null,
        val maxLength: Int? = null,
        val matches: Regex? = null,
        val prefix: String? = null,
        val suffix: String? = null,
        val allowNull: Boolean = true,
        val blankSpaceType: StringBlankSpaceType? = null,
        val mustContain: Set<String>? = null,
        val mustNotContain: Set<String>? = null,
        val supportedChars: Set<Char>? = null
)

enum class StringBlankSpaceType {

    ALLOW_EMPTY_NOT_BLANK,
    ALLOW_BLANK_NOT_EMPTY,
    NOT_EMPTY_OR_BLANK
}