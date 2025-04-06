package dev.junsung.exception

import org.springframework.http.HttpStatus

class NotFoundException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.NOT_FOUND, error, message)
