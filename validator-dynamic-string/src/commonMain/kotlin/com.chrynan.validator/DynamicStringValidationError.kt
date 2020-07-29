package com.chrynan.validator

sealed class DynamicStringValidationError(override val details: String? = null) : ValidationError {

    object MustNotBeNull : DynamicStringValidationError()

    data class MinLengthNotReached(val length: Int, val min: Int) : DynamicStringValidationError()

    data class MaxLengthExceeded(val length: Int, val max: Int) : DynamicStringValidationError()

    object RegexNotMatched : DynamicStringValidationError()

    object PrefixNotFound : DynamicStringValidationError()

    object SuffixNotFound : DynamicStringValidationError()

    object BlankNotAllowed : DynamicStringValidationError()

    object EmptyNotAllowed : DynamicStringValidationError()

    data class RequiredValueNotFound(val value: String) : DynamicStringValidationError()

    data class MustNotContainValue(val value: String) : DynamicStringValidationError()

    data class UnsupportedCharUsed(val char: Char) : DynamicStringValidationError()
}