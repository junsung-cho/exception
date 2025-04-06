package dev.junsung.exception
import org.springframework.http.HttpStatus

class PayloadTooLargeException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.PAYLOAD_TOO_LARGE, error, message)
