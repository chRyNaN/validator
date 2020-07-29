package com.chrynan.validator

import kotlin.test.Test
import kotlin.test.assertEquals

class PhoneNumberValidatorTest {

    private val validator = PhoneNumberValidator()

    @Test
    fun validUSPhoneNumberWithoutCountryCodeAndDelimitersPasses() {
        val result = validator.validate("5555555555")
        val expectedResult = Valid("5555555555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithCountryCodeAndWithoutDelimitersPasses() {
        val result = validator.validate("15555555555")
        val expectedResult = Valid("15555555555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithCountryCodeStartingWithPlusAndWithoutDelimitersPasses() {
        val result = validator.validate("+15555555555")
        val expectedResult = Valid("+15555555555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithoutCountryCodeAndWithDelimitersPasses() {
        val result = validator.validate("555-555-5555")
        val expectedResult = Valid("555-555-5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithoutCountryCodeAndWithDecimalDelimitersPasses() {
        val result = validator.validate("555.555.5555")
        val expectedResult = Valid("555.555.5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithCountryCodeAndWithDelimitersPasses() {
        val result = validator.validate("1-555-555-5555")
        val expectedResult = Valid("1-555-555-5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithCountryCodeAndWithDecimalDelimitersPasses() {
        val result = validator.validate("1.555.555.5555")
        val expectedResult = Valid("1.555.555.5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithCountryCodeWithPlusAndWithDelimitersPasses() {
        val result = validator.validate("+1-555-555-5555")
        val expectedResult = Valid("+1-555-555-5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validUSPhoneNumberWithCountryCodeWithPlusAndWithDecimalDelimitersPasses() {
        val result = validator.validate("+1.555.555.5555")
        val expectedResult = Valid("+1.555.555.5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validForeignPhoneNumberWithCountryCodeAndWithoutDelimitersPasses() {
        val result = validator.validate("665555555555")
        val expectedResult = Valid("665555555555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validForeignPhoneNumberWithCountryCodeStartingWithPlusAndWithoutDelimitersPasses() {
        val result = validator.validate("+665555555555")
        val expectedResult = Valid("+665555555555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validForeignPhoneNumberWithCountryCodeAndWithDelimitersPasses() {
        val result = validator.validate("66-555-555-5555")
        val expectedResult = Valid("66-555-555-5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validForeignPhoneNumberWithCountryCodeAndWithDecimalDelimitersPasses() {
        val result = validator.validate("66.555.555.5555")
        val expectedResult = Valid("66.555.555.5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validForeignPhoneNumberWithCountryCodeWithPlusAndWithDelimitersPasses() {
        val result = validator.validate("+66-555-555-5555")
        val expectedResult = Valid("+66-555-555-5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validForeignPhoneNumberWithCountryCodeWithPlusAndWithDecimalDelimitersPasses() {
        val result = validator.validate("+66.555.555.5555")
        val expectedResult = Valid("+66.555.555.5555")

        assertEquals(expectedResult, result)
    }

    @Test
    fun nullInputFails() {
        val result = validator.validate(null)
        val expectedResult: ValidationResult<String> = Invalid(PhoneNumberValidationError.InputIsNull)

        assertEquals(expectedResult, result)
    }

    @Test
    fun lettersFails() {
        val result = validator.validate("abcdefghij")
        val expectedResult: ValidationResult<String> = Invalid(PhoneNumberValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun unsupportedDelimiterFails() {
        val result = validator.validate("+66,555,555,5555")
        val expectedResult: ValidationResult<String> = Invalid(PhoneNumberValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }
}