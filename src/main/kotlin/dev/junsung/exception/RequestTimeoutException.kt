package dev.junsung.exception
import org.springframework.http.HttpStatus

class RequestTimeoutException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.REQUEST_TIMEOUT, error, message)
