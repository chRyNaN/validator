package com.chrynan.validator

import kotlin.reflect.KProperty

/**
 * Determines whether the provided [field] is valid. The provided [field] is valid if this [ValidationResult] is
 * [ValidationResult.Valid] (meaning all fields are valid), or if this [ValidationResult] is [ValidationResult.Invalid]
 * and does not contain a [FieldValidationError] for the provided [field].
 */
fun <T> ValidationResult<T>.isFieldValid(field: KProperty<*>): Boolean {
    return this is ValidationResult.Valid || (this is ValidationResult.Invalid && errors.none { it is FieldValidationError && it.field == field })
}

/**
 * Determines whether the provided [field] is invalid. The provided [field] is invalid if this [ValidationResult] is
 * [ValidationResult.Invalid] and contains a [FieldValidationError] for the provided [field].
 */
fun <T> ValidationResult<T>.isFieldInvalid(field: KProperty<*>): Boolean {
    return this is ValidationResult.Invalid && errors.any { it is FieldValidationError && it.field == field }
}

/**
 * Asserts that the provided [field] is valid in this [ValidationResult]. If the provided [field] is invalid, then a
 * [FieldValidationException] will be thrown. Otherwise, the function will end normally.
 */
inline fun <reified T> ValidationResult<T>.assertValidField(field: KProperty<*>) {
    if (isFieldInvalid(field)) throw FieldValidationException(field = field, result = this, expected = ValidationResult.Valid::class)
}

/**
 * Asserts that the provided [field] is invalid in this [ValidationResult]. If the provided [field] is valid, then a
 * [FieldValidationException] will be thrown. Otherwise, the function will end normally.
 */
inline fun <reified T> ValidationResult<T>.assertInvalidField(field: KProperty<*>) {
    if (isFieldValid(field)) throw FieldValidationException(field = field, result = this, expected = ValidationResult.Invalid::class)
}
