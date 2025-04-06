package dev.junsung.exception

import org.springframework.http.HttpStatus

class UnauthorizedException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.UNAUTHORIZED, error, message)
