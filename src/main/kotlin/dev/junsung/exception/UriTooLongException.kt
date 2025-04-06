package dev.junsung.exception
import org.springframework.http.HttpStatus

class UriTooLongException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.URI_TOO_LONG, error, message)
