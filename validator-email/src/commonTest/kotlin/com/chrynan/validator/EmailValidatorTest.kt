package com.chrynan.validator

import kotlin.test.Test
import kotlin.test.assertEquals

class EmailValidatorTest {

    private val validator = EmailValidator()

    @Test
    fun validEmailAddressPasses() {
        val result = validator.validate("test@example.com")
        val expectedResult = Valid("test@example.com")

        assertEquals(expectedResult, result)
    }

    @Test
    fun nullInputFails() {
        val result = validator.validate(null)
        val expectedResult: ValidationResult<String> = Invalid(EmailValidationError.InputIsNull)

        assertEquals(expectedResult, result)
    }

    // TODO
}
