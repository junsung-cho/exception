package dev.junsung.exception
import org.springframework.http.HttpStatus

class UnavailableForLegalReasonsException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, error, message)
