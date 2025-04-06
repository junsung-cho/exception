package dev.junsung.exception
import org.springframework.http.HttpStatus

class PreconditionFailedException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.PRECONDITION_FAILED, error, message)
