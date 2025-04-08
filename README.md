# Exception

A Kotlin library for handling HTTP exceptions in Spring applications.

## Overview

This library provides a set of exception classes that correspond to HTTP status codes, along with a mechanism to handle these exceptions in Spring applications. It simplifies the process of returning appropriate HTTP responses when exceptions occur.

## Installation

### Gradle (Kotlin DSL)

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("dev.junsung:exception:0.0.3")
}
```

### Maven

```xml
<dependency>
    <groupId>dev.junsung</groupId>
    <artifactId>exception</artifactId>
    <version>0.0.3</version>
</dependency>
```

## Usage

### Throwing Exceptions

You can throw exceptions directly:

```kotlin
import dev.junsung.exception.BadRequestException

throw BadRequestException(
    error = "INVALID_INPUT",
    message = "The provided input is invalid"
)
```

Or use the factory methods from the `RestException` companion object:

```kotlin
import dev.junsung.exception.RestException

throw RestException.badRequest(
    error = "INVALID_INPUT",
    message = "The provided input is invalid"
)
```

### Handling Exceptions

To handle exceptions, extend the `AbstractRestControllerAdvice` class in your Spring application:

```kotlin
import dev.junsung.exception.AbstractRestControllerAdvice
import org.springframework.web.bind.annotation.ControllerAdvice

@ControllerAdvice
class RestControllerAdvice : AbstractRestControllerAdvice()
```

This will automatically handle all `RestException` instances and return appropriate HTTP responses.

## Available Exception Classes

This library provides exception classes for many HTTP status codes, including:

- `BadRequestException` (400)
- `UnauthorizedException` (401)
- `PaymentRequiredException` (402)
- `ForbiddenException` (403)
- `NotFoundException` (404)
- `MethodNotAllowedException` (405)
- `NotAcceptableException` (406)
- `ProxyAuthenticationRequiredException` (407)
- `RequestTimeoutException` (408)
- `ConflictException` (409)
- `GoneException` (410)
- `LengthRequiredException` (411)
- `PreconditionFailedException` (412)
- `PayloadTooLargeException` (413)
- `UriTooLongException` (414)
- `UnsupportedMediaTypeException` (415)
- `RequestedRangeNotSatisfiableException` (416)
- `ExpectationFailedException` (417)
- `IAmATeapotException` (418)
- `UnprocessableEntityException` (422)
- `LockedException` (423)
- `FailedDependencyException` (424)
- `TooEarlyException` (425)
- `UpgradeRequiredException` (426)
- `PreconditionRequiredException` (428)
- `TooManyRequestsException` (429)
- `RequestHeaderFieldsTooLargeException` (431)
- `UnavailableForLegalReasonsException` (451)

## Error Response Structure

When an exception is handled, it returns a response with the following structure:

```json
{
  "timestamp": "2023-06-01T12:34:56.789",
  "status": 400,
  "error": "BAD_REQUEST",
  "message": "The provided input is invalid",
  "path": "/api/resource"
}
```
