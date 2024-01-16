//[validator-core](../../index.md)/[com.chrynan.validator](index.md)/[toResult](to-result.md)

# toResult

[common]\
fun &lt;[T](to-result.md)&gt; [ValidationResult](-validation-result/index.md)&lt;[T](to-result.md)&gt;.[toResult](to-result.md)(): [Result](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/index.html)&lt;[T](to-result.md)&gt;

Converts this [ValidationResult](-validation-result/index.md) instance into a Kotlin [Result](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/index.html) instance.

#### Return

[Result.failure](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/failure.html) with a [ValidationException](-validation-exception/index.md) if this is a [ValidationResult.Invalid](-validation-result/-invalid/index.md) instance, otherwise, [Result.success](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/success.html) with the [ValidationResult.Valid.value](-validation-result/-valid/value.md).
