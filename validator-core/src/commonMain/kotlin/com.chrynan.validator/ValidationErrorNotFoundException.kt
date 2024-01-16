package com.chrynan.validator

/**
 * A [RuntimeException] that indicates there was an error asserting that a [ValidationResult] contained a
 * [ValidationError].
 *
 * This exception is thrown from the [assertContains] function.
 */
class ValidationErrorNotFoundException(error: ValidationError) :
    ValidationException(
        message = "ValidationErrorNotFoundException: error = $error",
        errors = listOf(error)
    )
