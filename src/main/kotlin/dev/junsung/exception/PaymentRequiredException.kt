package dev.junsung.exception

import org.springframework.http.HttpStatus

class PaymentRequiredException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.PAYMENT_REQUIRED, error, message)
