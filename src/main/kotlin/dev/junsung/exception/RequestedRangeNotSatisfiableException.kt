package dev.junsung.exception
import org.springframework.http.HttpStatus

class RequestedRangeNotSatisfiableException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE, error, message)
