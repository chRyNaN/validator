# validator

A Kotlin Multi-platform Validation Library. Simple, flexible, and not tied to any particular framework. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/validator">

```kotlin
val result = validateEmail("example@example.com")

if (result.isValid) {
    // ...
}
```

## Introduction

This library has two fundamental pieces: `Validator` and `ValidationResult`. The `validator-core` module is the base
module and contains everything necessary for creating and working with `Validators`, including the `Validator`
and `ValidationResult` types.

### Validator

The `Validator` type is a simple interface that takes in a type `T`, performs validation on that type, and returns
a `ValidationResult` of type `R`:

```kotlin
interface Validator<T, R> {

    fun validate(input: T): ValidationResult<R>
}
```

So a `Validator` can be used like so:

```kotlin
val result = validator.validate("exampleInput")
```

The `Validator` interface also provides the following operator function which just delegates to the `validate` function:

```kotlin
operator fun invoke(input: T): ValidationResult<R> = validate(input)
```

This way, a `Validator` can also be used like so:

```kotlin
val result = validator("exampleInput")
```

#### Generic Types

The `Validator` interface takes two generic type parameters `<T, R>`. This allows `Validators` to return a different
value than they take in as their input and can be especially useful for `Validators` that take in nullable types for
their input and wish to return a non-null type for their output. This works because the returned value is only available
for a `ValidationResult.Success` result.

For example, consider the following `Validator` that takes in a nullable type of `String?` and returns a non-null type
of `String`:

```kotlin
class NonNullStringValidator : Validator<String?, String> {

    override fun validate(input: String?) = if (input == null) Invalid() else Valid(input)
}
```

### ValidationResult

The `ValidationResult` type is a sealed class with two sub-classes: `Valid` and `Invalid`. Obviously, the `Valid` type
should be returned from a `Validator` when the validation succeeded, and the `Invalid` when the validation failed.

Checking for the `ValidationResult` type is as simple as using Kotlin's `is` keyword:

```kotlin
val result = validator(input)

if (result is ValidationResult.Valid) {
}
if (result is ValidationResult.Invalid) {
}
```

Or if only the condition is required, then the `isValid` and `isInvalid` convenience functions can be used:

```kotlin
val result = validator(input)

if (result.isValid) {
}
if (result.isInvalid) {
}
```

#### Valid

The `Valid` class has a single `value` property which contains the successfully validated input to a `Validator`.

```kotlin
val result = validateNonNullString("nonNullStringInput")

when (result) {
    is ValidationResult.Valid -> performSuccessAction(result.value)
}
```

To create a `Valid` object instance, simply call the constructor function with the return value:

```kotlin
Valid(validatedInput)
```

#### Invalid

The `Invalid` class has an `errors` property which is a Kotlin `Collection` of `ValidationError`. Accessing these errors
is just as simple as accessing a `Valid.value` property:

```kotlin
val result = validateNonNullString(null)

when (result) {
    is ValidationResult.Invalid -> performFailedAction(result.errors)
}
```

To create an `Invalid` object instance, simply call one of the constructor functions with the errors encountered:

```kotlin
Invalid(errorOne, errorTwo)
// Or
Invalid(listOf(errorOne, errorTwo))
```

#### ValidationError

The `ValidationError` type is a simple interface with an optional `details` property:

```kotlin
interface ValidationError {

    val details: String?
}
```

**Note:** `ValidationError` implementations can be
Kotlin [Exceptions](https://kotlinlang.org/docs/tutorials/kotlin-for-py/exceptions.html) but they are not thrown from
a `Validator` and instead are wrapped in a `ValidationResult.Invalid` class and returned.

A `ValidationError` implementation can be whatever is required, but a common pattern is to use sealed classes:

```kotlin
sealed class ExampleError(override val details: String? = null) : ValidationError {

    object Null : ExampleError()

    object TooShort : ExampleError()

    object TooLong : ExampleError()

    data class InvalidCharacters(val characters: List<Char>) : ExampleError()
}
```

There's a convenience operator function on the `ValidationResult` class to determine if it is an `Invalid` instance and
contains the provided `ValidationError`:

```kotlin
val result = validate(input)

if (result.contains(ExampleError.Null)) {
}
```

## Common Validators

The `validator-core` module contains everything necessary to create and work with validation logic. But sometimes more
specific functionality is required. That's why this library contains separate modules for extra functionality and
specific use cases. With this approach, the User can choose which functionality they utilize.

Currently, the following modules are available:

* `validator-core` - The common code and base for the whole library.
* `validator-dynamic-string` - A Kotlin DSL approach for creating a Validator for `String` input.
* `validator-email` - Provides validation for determining whether a `String` is in a valid Email format.
* `validator-field` - An extension on the `validator-core` module, providing a `FieldValidationError` which associates a
  Kotlin property on a class.
* `validator-mac` - Provides validation for determining whether a `String` is in a valid MAC Address format.
* `validator-phone` - Provides validation for determining whether a `String` is in a valid Phone Number format.
* `validator-web` - Provides `Validators` for web-based `String` formats, such as, URLs, URIs, and IP Addresses.

## Building the library

The library is provided through [Repsy.io](https://repsy.io). Checkout
the [releases page](https://github.com/chRyNaN/validator/releases) to get the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/validator">

### Repository

```groovy
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

**Core:**

```groovy
implementation "com.chrynan.validator:validator-core:$VERSION"
```

**Dynamic String:**

```groovy
implementation "com.chrynan.validator:validator-dynamic-string:$VERSION"
```

**Email:**

```groovy
implementation "com.chrynan.validator:validator-email:$VERSION"
```

**Field:**

```groovy
implementation "com.chrynan.validator:validator-field:$VERSION"
```

**Mac Address:**

```groovy
implementation "com.chrynan.validator:validator-mac:$VERSION"
```

**Phone Number:**

```groovy
implementation "com.chrynan.validator:validator-phone:$VERSION"
```

**Web:**

```groovy
implementation "com.chrynan.validator:validator-web:$VERSION"
```

## Documentation

More detailed documentation is available in the [docs](docs) folder. The entry point to the documentation can be
found [here](docs/index.md).

## Contributing

Contributions are welcome and encouraged! Please consider the following when contributing code:

* All validation code must be written in the `commonMain` source set. If this is not possible, then each target platform
  must have an actual implementation.
* All public facing code must have detailed KDoc comments.
* All code must have corresponding tests written in the `commonTest` source set.
* Follow existing coding conventions for this repository.
* If submitting a new `Validator`, make sure it is a common use case.
* Code reviews must maintain a productive, courteous, and respectful atmosphere.
* Self review code before submitting a PR.
* All CI builds must pass for a PR to be merged.
* All submitted code will be subject to this repository's [license](LICENSE).

## Why this library?

It's true, there are many Kotlin validation libraries. However, I found myself unsatisfied with the current
implementations for the following reasons:

* Tied to a framework.
    * Most of the available validation libraries were built around UI Components from frameworks like Android.
* Not multi-platform.
    * The available validation libraries typically are for either a framework, like Android, or specifically for the
      JVM.
    * There's no reason why the code can't be written for Kotlin Multi-platform, so that it can be used anywhere.
* No flexibility.
    * The current libraries are all or nothing. Including functionality that might not be required.
    * Forced to conform to a particular DSL approach without the ability to extend the functionality.

This library aims to resolve the issues with the other libraries by:

* Not being tied to a framework.
* Supporting Kotlin Multi-platform.
* Providing flexibility to choose functionality.
* Being extensible.
* Providing commonly used `Validators`.

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
