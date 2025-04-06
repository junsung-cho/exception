package dev.junsung.exception

import org.springframework.http.HttpStatus

class BadRequestException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.BAD_REQUEST, error, message)
