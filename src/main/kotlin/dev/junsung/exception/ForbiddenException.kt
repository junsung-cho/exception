package dev.junsung.exception

import org.springframework.http.HttpStatus

class ForbiddenException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.FORBIDDEN, error, message)
