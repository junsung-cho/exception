package dev.junsung.exception

import org.springframework.http.HttpStatus

class ExpectationFailedException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.EXPECTATION_FAILED, error, message)
