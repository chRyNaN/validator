//[validator-core](../../index.md)/[com.chrynan.validator](index.md)/[assertContains](assert-contains.md)

# assertContains

[common]\
inline fun &lt;[T](assert-contains.md)&gt; [ValidationResult](-validation-result/index.md)&lt;[T](assert-contains.md)&gt;.[assertContains](assert-contains.md)(error: [ValidationError](-validation-error/index.md))

Asserts that this [ValidationResult](-validation-result/index.md) contains the provided [error](assert-contains.md). If this [ValidationResult](-validation-result/index.md) does not contain the provided [error](assert-contains.md) or this [ValidationResult](-validation-result/index.md) is a [ValidationResult.Valid](-validation-result/-valid/index.md) instance, then [ValidationErrorNotFoundException](-validation-error-not-found-exception/index.md) will be thrown.
