@file:Suppress("unused")

package com.chrynan.validator

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

fun <T, R> Flow<T>.validate(block: suspend (T) -> ValidationResult<R>): Flow<ValidationResult<R>> =
    map { block(it) }

fun <T> Flow<ValidationResult<T>>.onValid(block: suspend (value: T) -> Unit): Flow<ValidationResult<T>> =
    onEach {
        if (it is ValidationResult.Valid) {
            block(it.value)
        }
    }

fun <T> Flow<ValidationResult<T>>.onInvalid(block: suspend (errors: List<ValidationError>) -> Unit): Flow<ValidationResult<T>> =
    onEach {
        if (it is ValidationResult.Invalid) {
            block(it.errors.toList())
        }
    }
