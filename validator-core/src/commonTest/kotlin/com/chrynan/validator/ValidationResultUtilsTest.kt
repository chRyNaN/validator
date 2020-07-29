package com.chrynan.validator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class ValidationResultUtilsTest {

    @Test
    fun isValidReturnsTrueForValidResult() {
        val result = Valid("")

        assertEquals(true, result.isValid)
    }

    @Test
    fun isValidReturnsFalseForInvalidResult() {
        val result = Invalid<String>()

        assertEquals(false, result.isValid)
    }

    @Test
    fun isInvalidReturnsFalseForValidResult() {
        val result = Valid("")

        assertEquals(false, result.isInvalid)
    }

    @Test
    fun isInvalidReturnsTrueForInvalidResult() {
        val result = Invalid<String>()

        assertEquals(true, result.isInvalid)
    }

    @Test
    fun containsReturnsFalseForValidResult() {
        val result = Valid("")
        val error = object : ValidationError {

            override val details: String?
                get() = null
        }

        assertEquals(false, result.contains(error))
    }

    @Test
    fun containsReturnsFalseForEmptyInvalidResult() {
        val result = Invalid<String>()
        val error = object : ValidationError {

            override val details: String?
                get() = null
        }

        assertEquals(false, result.contains(error))
    }

    @Test
    fun containsReturnsFalseForInvalidResultWithoutTheError() {
        val errorOne = object : ValidationError {

            override val details: String?
                get() = null
        }
        val errorTwo = object : ValidationError {

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(errorOne)

        assertEquals(false, result.contains(errorTwo))
    }

    @Test
    fun containsReturnsTrueForInvalidResultWithTheError() {
        val error = object : ValidationError {

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        assertEquals(true, result.contains(error))
    }

    @Test
    fun assertValidPassesForValidResult() {
        val result = Valid("Test")

        assertValid(result)
    }

    @Test
    fun assertValidFailsForInvalidResult() {
        val result = Invalid<String>()

        assertFails { assertValid(result) }
    }

    @Test
    fun assertInvalidFailsForValidResult() {
        val result = Valid("Test")

        assertFails { assertInvalid(result) }
    }

    @Test
    fun assertInvalidPassesForInvalidResult() {
        val result = Invalid<String>()

        assertInvalid(result)
    }

    @Test
    fun assertContainsFailsForValidResult() {
        val result = Valid("Test")
        val error = object : ValidationError {

            override val details: String?
                get() = null
        }

        assertFails { result.assertContains(error) }
    }

    @Test
    fun assertContainsFailsForEmptyInvalidResult() {
        val result = Invalid<String>()
        val error = object : ValidationError {

            override val details: String?
                get() = null
        }

        assertFails { result.assertContains(error) }
    }

    @Test
    fun assertContainsFailsForInvalidResultWithoutError() {
        val errorOne = object : ValidationError {

            override val details: String?
                get() = null
        }
        val errorTwo = object : ValidationError {

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(errorOne)

        assertFails { result.assertContains(errorTwo) }
    }

    @Test
    fun assertContainsPassesForInvalidResultWithError() {
        val error = object : ValidationError {

            override val details: String?
                get() = null
        }
        val result = Invalid<String>(error)

        result.assertContains(error)
    }
}
