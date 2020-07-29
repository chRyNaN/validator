package com.chrynan.validator

class InvalidDynamicStringConfigException(
        message: String,
        config: DynamicStringConfig? = null
) : RuntimeException("InvalidDynamicStringConfigException: $message\n config = $config\n")