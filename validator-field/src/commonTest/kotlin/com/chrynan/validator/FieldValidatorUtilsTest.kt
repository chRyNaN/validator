package com.chrynan.validator

import kotlin.reflect.KProperty
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class FieldValidatorUtilsTest {

    @Test
    fun isFieldValidReturnsTrueForValidResult() {
        val result = Valid("Test")

        assertEquals(true, result.isFieldValid(TestClass::one))
    }

    @Test
    fun isFieldValidReturnsTrueForEmptyInvalidResult() {
        val result = Invalid<String>()

        assertEquals(true, result.isFieldValid(TestClass::one))
    }

    @Test
    fun isFieldValidReturnsTrueForInvalidResultWithoutField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        assertEquals(true, result.isFieldValid(TestClass::two))
    }

    @Test
    fun isFieldValidReturnsFalseForInvalidResultWithField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        assertEquals(false, result.isFieldValid(TestClass::one))
    }

    @Test
    fun isFieldInvalidReturnsFalseForValidResult() {
        val result = Valid("Test")

        assertEquals(false, result.isFieldInvalid(TestClass::one))
    }

    @Test
    fun isFieldInvalidReturnsFalseForEmptyInvalidResult() {
        val result = Invalid<String>()

        assertEquals(false, result.isFieldInvalid(TestClass::one))
    }

    @Test
    fun isFieldInvalidReturnsFalseForInvalidResultWithoutField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        assertEquals(false, result.isFieldInvalid(TestClass::two))
    }

    @Test
    fun isFieldInvalidReturnsTrueForInvalidResultWithField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        assertEquals(true, result.isFieldInvalid(TestClass::one))
    }

    @Test
    fun assertValidFieldPassesForValidResult() {
        val result = Valid("Test")

        result.assertValidField(TestClass::one)
    }

    @Test
    fun assertValidFieldPassesForEmptyInvalidResult() {
        val result = Invalid<String>()

        result.assertValidField(TestClass::one)
    }

    @Test
    fun assertValidFieldPassesForInvalidResultWithoutField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        result.assertValidField(TestClass::two)
    }

    @Test
    fun assertValidFieldFailsForInvalidResultWithField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        assertFails { result.assertValidField(TestClass::one) }
    }

    @Test
    fun assertInvalidFieldFailsForValidResult() {
        val result = Valid("Test")

        assertFails { result.assertInvalidField(TestClass::one) }
    }

    @Test
    fun assertInvalidFieldFailsForEmptyInvalidResult() {
        val result = Invalid<String>()

        assertFails { result.assertInvalidField(TestClass::one) }
    }

    @Test
    fun assertInvalidFieldFailsForInvalidResultWithoutField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        assertFails { result.assertInvalidField(TestClass::two) }
    }

    @Test
    fun assertInvalidFieldPassesForInvalidResultWithField() {
        val error = object : FieldValidationError {

            override val field: KProperty<*>
                get() = TestClass::one

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        result.assertInvalidField(TestClass::one)
    }

    private data class TestClass(
            val one: String,
            val two: String
    )
}
