package dev.junsung.exception
import org.springframework.http.HttpStatus

class TooEarlyException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.TOO_EARLY, error, message)
