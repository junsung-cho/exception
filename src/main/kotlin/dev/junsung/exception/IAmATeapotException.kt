package dev.junsung.exception
import org.springframework.http.HttpStatus

class IAmATeapotException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.I_AM_A_TEAPOT, error, message)
