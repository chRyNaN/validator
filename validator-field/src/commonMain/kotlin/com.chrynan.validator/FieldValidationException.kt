package com.chrynan.validator

import kotlin.reflect.KClass
import kotlin.reflect.KProperty

/**
 * A [RuntimeException] that indicates there was an error asserting that a field was valid or invalid.
 *
 * This exception is thrown from the [assertValidField] and [assertInvalidField] functions.
 */
class FieldValidationException internal constructor(
        message: String? = null
) : RuntimeException(message)

/**
 * A creator function for the [FieldValidationException] class.
 */
@Suppress("FunctionName")
fun <T, E : ValidationResult<*>> FieldValidationException(
        message: String? = null,
        field: KProperty<*>,
        result: ValidationResult<T>,
        expected: KClass<E>
): FieldValidationException {
    val fullMessage = buildString {
        append("FieldValidationException: Unexpected Field ValidationResult: expected = $expected;\n")
        append("field = $field\n")
        append("result = $result\n")

        if (message != null) {
            append("message = $message\n")
        }
    }

    return FieldValidationException(message = fullMessage)
}
