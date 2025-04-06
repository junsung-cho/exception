package dev.junsung.exception

import org.springframework.http.HttpStatus

class NotAcceptableException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.NOT_ACCEPTABLE, error, message)
