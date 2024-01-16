//[validator-core](../../index.md)/[com.chrynan.validator](index.md)/[validate](validate.md)

# validate

[common]\
fun &lt;[T](validate.md)&gt; [Result](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/index.html)&lt;[T](validate.md)&gt;.[validate](validate.md)(): [ValidationResult](-validation-result/index.md)&lt;[T](validate.md)&gt;

Converts this Kotlin [Result](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/index.html) instance into a [ValidationResult](-validation-result/index.md) instance. If the [Result.getOrNull](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/get-or-null.html) returns a non-null value, then a [ValidationResult.Valid](-validation-result/-valid/index.md) instance is returned with that value. Otherwise, a [ValidationResult.Invalid](-validation-result/-invalid/index.md) instance is returned with a [ValidationException](-validation-exception/index.md) as the [ValidationError](-validation-error/index.md) wrapping the optional [Result.failure](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/failure.html) value.

[common]\
fun &lt;[T](validate.md), [R](validate.md)&gt; Flow&lt;[T](validate.md)&gt;.[validate](validate.md)(block: suspend ([T](validate.md)) -&gt; [ValidationResult](-validation-result/index.md)&lt;[R](validate.md)&gt;): Flow&lt;[ValidationResult](-validation-result/index.md)&lt;[R](validate.md)&gt;&gt;
