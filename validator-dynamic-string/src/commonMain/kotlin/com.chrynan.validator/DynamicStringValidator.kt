package com.chrynan.validator

class DynamicStringValidator internal constructor(private val config: DynamicStringConfig) : Validator<String?, String?> {

    override fun validate(input: String?): ValidationResult<String?> {
        if (!config.allowNull && input == null) return Invalid(DynamicStringValidationError.MustNotBeNull)

        if (config.minLength != null && (input?.length ?: 0) < config.minLength) {
            return Invalid(DynamicStringValidationError.MinLengthNotReached(length = input?.length
                    ?: 0, min = config.minLength))
        }

        if (config.maxLength != null && (input?.length ?: 0) > config.maxLength) {
            return Invalid(DynamicStringValidationError.MaxLengthExceeded(length = input?.length
                    ?: 0, max = config.maxLength))
        }

        if (config.matches != null && (input?.matches(config.matches) != true)) {
            return Invalid(DynamicStringValidationError.RegexNotMatched)
        }

        if (config.prefix != null && (input?.startsWith(config.prefix) != true)) {
            return Invalid(DynamicStringValidationError.PrefixNotFound)
        }

        if (config.suffix != null && (input?.endsWith(config.suffix) != true)) {
            return Invalid(DynamicStringValidationError.SuffixNotFound)
        }

        if (config.blankSpaceType != null) {
            val result: ValidationResult.Invalid<String?>? = when {
                config.blankSpaceType == StringBlankSpaceType.ALLOW_EMPTY_NOT_BLANK && input?.isBlank() == true -> Invalid(DynamicStringValidationError.BlankNotAllowed)
                config.blankSpaceType == StringBlankSpaceType.ALLOW_BLANK_NOT_EMPTY && input?.isEmpty() == true -> Invalid(DynamicStringValidationError.EmptyNotAllowed)
                config.blankSpaceType == StringBlankSpaceType.NOT_EMPTY_OR_BLANK && input?.isBlank() == true -> Invalid(DynamicStringValidationError.BlankNotAllowed)
                config.blankSpaceType == StringBlankSpaceType.NOT_EMPTY_OR_BLANK && input?.isEmpty() == true -> Invalid(DynamicStringValidationError.EmptyNotAllowed)
                else -> null
            }

            if (result != null) return result
        }

        if (config.mustContain != null) {
            val value = config.mustContain.firstOrNull { input?.contains(it) != true }

            if (value != null) {
                return Invalid(DynamicStringValidationError.RequiredValueNotFound(value = value))
            }
        }

        if (config.mustNotContain != null) {
            val value = config.mustNotContain.firstOrNull { input?.contains(it) == true }

            if (value != null) {
                return Invalid(DynamicStringValidationError.MustNotContainValue(value = value))
            }
        }

        if (config.supportedChars != null) {
            val char = input?.asSequence()?.firstOrNull { !config.supportedChars.contains(it) }

            if (char != null) {
                return Invalid(DynamicStringValidationError.UnsupportedCharUsed(char = char))
            }
        }

        return Valid(input)
    }
}

fun dynamicStringValidator(configBuilder: DynamicStringConfig.() -> Unit): DynamicStringValidator {
    val config = DynamicStringConfig()

    configBuilder.invoke(config)

    validateConfig(config)

    return DynamicStringValidator(config)
}

@Suppress("NOTHING_TO_INLINE")
private inline fun validateConfig(config: DynamicStringConfig) {
    if (config.minLength != null && config.maxLength != null && config.minLength > config.maxLength) {
        throw InvalidDynamicStringConfigException("Minimum length cannot be larger than maximum length.", config)
    }

    if (config.mustContain != null && config.mustNotContain != null && config.mustContain.any { config.mustNotContain.contains(it) }) {
        throw InvalidDynamicStringConfigException("Conflict in mustContain and mustNotContain fields. Cannot simultaneously contain and not contain an item.", config)
    }

    if (config.mustContain != null && config.supportedChars != null && config.mustContain.any { it.asSequence().any { char -> !config.supportedChars.contains(char) } }) {
        throw InvalidDynamicStringConfigException("mustContain value cannot contain Chars that are not in the supportedChars Set.", config)
    }
}