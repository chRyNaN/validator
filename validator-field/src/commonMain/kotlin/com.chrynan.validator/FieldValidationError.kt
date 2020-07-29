package com.chrynan.validator

import kotlin.reflect.KProperty

/**
 * A [ValidationError] for a particular field on an object. This could be useful to retain information about which
 * fields failed validation.
 *
 * @property [field] The [KProperty] representing the field that caused this [ValidationError].
 */
interface FieldValidationError : ValidationError {

    val field: KProperty<*>
}
