package com.chrynan.validator

/**
 * Determines whether this [ValidationResult] is a [ValidationResult.Valid] class.
 */
val <T> ValidationResult<T>.isValid
    inline get() = this is ValidationResult.Valid

/**
 * Determines whether this [ValidationResult] is a [ValidationResult.Invalid] class.
 */
val <T> ValidationResult<T>.isInvalid
    inline get() = this is ValidationResult.Invalid

/**
 * Determines whether this [ValidationResult] contains the provided [error]. If this [ValidationResult] is a
 * [ValidationResult.Valid] class, then this will always return false as there are no errors.
 */
operator fun <T> ValidationResult<T>.contains(error: ValidationError): Boolean =
    this is ValidationResult.Invalid && errors.contains(error)

/**
 * Asserts that the provided [result] is a [ValidationResult.Valid] instance. If it is not then a [ValidationException]
 * will be thrown.
 */
inline fun <reified T> assertValid(result: ValidationResult<T>) {
    if (result.isInvalid) throw ValidationException(result = result, expected = ValidationResult.Valid::class)
}

/**
 * Asserts that the provided [result] is a [ValidationResult.Invalid] instance. If it is not then a
 * [ValidationException] will be thrown.
 */
inline fun <reified T> assertInvalid(result: ValidationResult<T>) {
    if (result.isValid) throw ValidationException(result = result, expected = ValidationResult.Invalid::class)
}

/**
 * Asserts that this [ValidationResult] contains the provided [error]. If this [ValidationResult] does not contain the
 * provided [error] or this [ValidationResult] is a [ValidationResult.Valid] instance, then
 * [ValidationErrorNotFoundException] will be thrown.
 */
inline fun <reified T> ValidationResult<T>.assertContains(error: ValidationError) {
    if (!contains(error)) throw ValidationErrorNotFoundException(error = error)
}

/**
 * Converts this [ValidationResult] instance into a Kotlin [Result] instance.
 *
 * @return [Result.failure] with a [ValidationException] if this is a [ValidationResult.Invalid] instance, otherwise,
 * [Result.success] with the [ValidationResult.Valid.value].
 */
fun <T> ValidationResult<T>.toResult(): Result<T> =
    when (this) {
        is ValidationResult.Valid -> Result.success(value = this.value)
        is ValidationResult.Invalid -> Result.failure(exception = ValidationException(errors = this.errors))
    }
