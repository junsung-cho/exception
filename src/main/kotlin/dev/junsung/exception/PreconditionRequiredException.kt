package dev.junsung.exception
import org.springframework.http.HttpStatus

class PreconditionRequiredException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.PRECONDITION_REQUIRED, error, message)
