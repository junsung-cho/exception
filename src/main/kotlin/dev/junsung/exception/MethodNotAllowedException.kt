package dev.junsung.exception

import org.springframework.http.HttpStatus

class MethodNotAllowedException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.METHOD_NOT_ALLOWED, error, message)
