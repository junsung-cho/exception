package dev.junsung.exception
import org.springframework.http.HttpStatus

class LengthRequiredException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.LENGTH_REQUIRED, error, message)
