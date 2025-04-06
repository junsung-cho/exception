package dev.junsung.exception
import org.springframework.http.HttpStatus

class RequestHeaderFieldsTooLargeException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE, error, message)
