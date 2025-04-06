package dev.junsung.exception
import org.springframework.http.HttpStatus

class TooManyRequestsException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.TOO_MANY_REQUESTS, error, message)
