package com.chrynan.validator

/**
 * Represents the result of a [Validator.validate] function call. This could either be a [Valid] or [Invalid] result.
 */
sealed class ValidationResult<T> {

    /**
     * A [ValidationResult] that indicates that the provided input to a [Validator.validate] function was considered
     * valid, or that the validation was considered successful. The [value] property is the valid input for the
     * [Validator.validate] function.
     */
    class Valid<T> internal constructor(val value: T) : ValidationResult<T>() {

        override fun hashCode(): Int = value.hashCode()

        override fun equals(other: Any?): Boolean {
            val otherResult = castToValid(other) ?: return false

            return otherResult.value == value
        }

        override fun toString(): String = "Valid: value = $value"

        @Suppress("UNCHECKED_CAST")
        private fun castToValid(other: Any?): Valid<T>? =
            try {
                other as? Valid<T>
            } catch (_: Throwable) {
                null
            }
    }

    /**
     * A [ValidationResult] that indicates that the provided input to a [Validator.validate] function was considered
     * invalid, or that the validation was considered unsuccessful. The [errors] property are the [Collection] of
     * errors that were encountered when performing the validation.
     */
    data class Invalid<T> internal constructor(val errors: Collection<ValidationError>) : ValidationResult<T>() {

        override fun toString(): String = "Invalid: errors = $errors"
    }
}

/**
 * A convenience function that creates an [ValidationResult.Valid] class with the provided [value]. This function just
 * delegates to the [ValidationResult.Valid] constructor.
 */
@Suppress("FunctionName")
fun <T> Valid(value: T): ValidationResult.Valid<T> = ValidationResult.Valid(value)

/**
 * A convenience function that creates an [ValidationResult.Invalid] class with the provided [errors]. This function
 * just delegates to the [ValidationResult.Valid] constructor.
 */
@Suppress("FunctionName")
fun <T> Invalid(errors: List<ValidationError>): ValidationResult.Invalid<T> = ValidationResult.Invalid(errors)

/**
 * A convenience function that creates an [ValidationResult.Invalid] class with a vararg number of [ValidationError]s.
 * This function just delegates to the [ValidationResult.Invalid] constructor with the vararg parameters as a [List].
 */
@Suppress("FunctionName")
fun <T> Invalid(vararg errors: ValidationError): ValidationResult.Invalid<T> = ValidationResult.Invalid(errors.toList())
