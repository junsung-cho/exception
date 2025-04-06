package dev.junsung.exception
import org.springframework.http.HttpStatus

class ProxyAuthenticationRequiredException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, error, message)
