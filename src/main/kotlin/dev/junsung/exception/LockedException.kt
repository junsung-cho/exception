package dev.junsung.exception
import org.springframework.http.HttpStatus

class LockedException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.LOCKED, error, message)
