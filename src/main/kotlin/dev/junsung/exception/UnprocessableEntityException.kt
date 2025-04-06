package dev.junsung.exception

import org.springframework.http.HttpStatus

class UnprocessableEntityException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.UNPROCESSABLE_ENTITY, error, message)
