package com.chrynan.validator

import kotlin.test.Test
import kotlin.test.assertEquals

class MacAddressValidatorTest {

    private val validator = MacAddressValidator()

    @Test
    fun validMacAddressWithColonsPasses() {
        val result = validator.validate("AA:BB:CC:11:22:33")
        val expectedResult = Valid("AA:BB:CC:11:22:33")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validMacAddressWithHyphensPasses() {
        val result = validator.validate("AA-BB-CC-11-22-33")
        val expectedResult = Valid("AA-BB-CC-11-22-33")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validMacAddressWithDecimalsPasses() {
        val result = validator.validate("AA.BB.CC.11.22.33")
        val expectedResult = Valid("AA.BB.CC.11.22.33")

        assertEquals(expectedResult, result)
    }

    @Test
    fun validMacAddressWithLowerAndUppercaseLettersPasses() {
        val result = validator.validate("AA:bb:cC:11:22:33")
        val expectedResult = Valid("AA:bb:cC:11:22:33")

        assertEquals(expectedResult, result)
    }

    @Test
    fun macAddressWithColonHyphenMixFails() {
        val result = validator.validate("AA:BB:CC:11:22-33")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun macAddressWithColonDecimalMixFails() {
        val result = validator.validate("AA:BB:CC:11:22.33")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun macAddressWithDecimalHyphenMixFails() {
        val result = validator.validate("AA-BB-CC-11-22.33")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun nullInputValueFails() {
        val result = validator.validate(null)
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InputIsNull)

        assertEquals(expectedResult, result)
    }

    @Test
    fun macAddressWithUnsupportedDelimiterFails() {
        val result = validator.validate("AA,BB,CC,11,22,33")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun macAddressWithNoDelimiterFails() {
        val result = validator.validate("AABBCC112233")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun tooManyCharactersInGroupFails() {
        val result = validator.validate("AA:BB:CC:11:22:331")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun tooManyGroupsFails() {
        val result = validator.validate("AA:BB:CC:11:22:33:AA")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun tooFewCharactersInGroupFails() {
        val result = validator.validate("AA:BB:CC:11:22:3")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun tooFewGroupFails() {
        val result = validator.validate("AA:BB:CC:11:22")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun startingWithColonDelimiterFails() {
        val result = validator.validate(":AA:BB:CC:11:22:33")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun startingWithHyphenDelimiterFails() {
        val result = validator.validate("-AA-BB-CC-11-22-33")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun startingWithDecimalDelimiterFails() {
        val result = validator.validate(".AA.BB.CC.11.22.33")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun endingWithColonDelimiterFails() {
        val result = validator.validate("AA:BB:CC:11:22:33:")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun endingWithHyphenDelimiterFails() {
        val result = validator.validate("AA-BB-CC-11-22-33-")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun endingWithDecimalDelimiterFails() {
        val result = validator.validate("AA.BB.CC.11.22.33.")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }

    @Test
    fun charactersOutOfRangeFails() {
        val result = validator.validate("AA:BB:CC:DD:EE:FG")
        val expectedResult: ValidationResult<String> = Invalid(MacAddressValidationError.InvalidFormat)

        assertEquals(expectedResult, result)
    }
}