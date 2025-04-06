package dev.junsung.exception

import org.springframework.http.HttpStatus

class ConflictException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.CONFLICT, error, message)
