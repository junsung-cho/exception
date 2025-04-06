package dev.junsung.exception
import org.springframework.http.HttpStatus

class UpgradeRequiredException(
    error: String?,
    message: String?,
) : RestException(HttpStatus.UPGRADE_REQUIRED, error, message)
