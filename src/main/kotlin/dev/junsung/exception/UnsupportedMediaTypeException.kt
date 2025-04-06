package dev.junsung.exception
import org.springframework.http.HttpStatus

class UnsupportedMediaTypeException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.UNSUPPORTED_MEDIA_TYPE, error, message)
