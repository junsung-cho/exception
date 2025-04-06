package dev.junsung.exception
import org.springframework.http.HttpStatus

class GoneException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.GONE, error, message)
