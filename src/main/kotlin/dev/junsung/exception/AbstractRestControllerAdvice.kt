package dev.junsung.exception

import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler

abstract class AbstractRestControllerAdvice {
    @ExceptionHandler(RestException::class)
    fun handle(
        exception: RestException,
        request: HttpServletRequest,
    ): ResponseEntity<ErrorResponse> = ResponseEntity.status(exception.status).body(exception.toResponse(request))
}
