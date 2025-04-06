package dev.junsung.exception
import org.springframework.http.HttpStatus

class FailedDependencyException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.FAILED_DEPENDENCY, error, message)
