package dev.junsung.exception

import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import java.time.LocalDateTime

sealed class RestException(
    val status: HttpStatus,
    error: String?,
    message: String?,
) : RuntimeException() {
    private val error: String = error ?: status.name
    override val message: String = message ?: status.reasonPhrase

    fun toResponse(request: HttpServletRequest) =
        ErrorResponse(
            timestamp = LocalDateTime.now().toString(),
            status = status.value(),
            error = error,
            message = message,
            path = request.requestURI,
        )

    companion object {
        fun badRequest(
            message: String? = null,
            error: String? = null,
        ) = BadRequestException(error, message)

        fun unauthorized(
            message: String? = null,
            error: String? = null,
        ) = UnauthorizedException(error, message)

        fun paymentRequired(
            message: String? = null,
            error: String? = null,
        ) = PaymentRequiredException(error, message)

        fun forbidden(
            message: String? = null,
            error: String? = null,
        ) = ForbiddenException(error, message)

        fun notFound(
            message: String? = null,
            error: String? = null,
        ) = NotFoundException(error, message)

        fun methodNotAllowed(
            message: String? = null,
            error: String? = null,
        ) = MethodNotAllowedException(error, message)

        fun notAcceptable(
            message: String? = null,
            error: String? = null,
        ) = NotAcceptableException(error, message)

        fun proxyAuthenticationRequired(
            message: String? = null,
            error: String? = null,
        ) = ProxyAuthenticationRequiredException(error, message)

        fun requestTimeout(
            message: String? = null,
            error: String? = null,
        ) = RequestTimeoutException(error, message)

        fun conflict(
            message: String? = null,
            error: String? = null,
        ) = ConflictException(error, message)

        fun gone(
            message: String? = null,
            error: String? = null,
        ) = GoneException(error, message)

        fun lengthRequired(
            message: String? = null,
            error: String? = null,
        ) = LengthRequiredException(error, message)

        fun preconditionFailed(
            message: String? = null,
            error: String? = null,
        ) = PreconditionFailedException(error, message)

        fun payloadTooLarge(
            message: String? = null,
            error: String? = null,
        ) = PayloadTooLargeException(error, message)

        fun uriTooLong(
            message: String? = null,
            error: String? = null,
        ) = UriTooLongException(error, message)

        fun unsupportedMediaType(
            message: String? = null,
            error: String? = null,
        ) = UnsupportedMediaTypeException(error, message)

        fun requestedRangeNotSatisfiable(
            message: String? = null,
            error: String? = null,
        ) = RequestedRangeNotSatisfiableException(error, message)

        fun expectationFailed(
            message: String? = null,
            error: String? = null,
        ) = ExpectationFailedException(error, message)

        fun iAmATeapot(
            message: String? = null,
            error: String? = null,
        ) = IAmATeapotException(error, message)

        fun unprocessableEntity(
            message: String? = null,
            error: String? = null,
        ) = UnprocessableEntityException(error, message)

        fun locked(
            message: String? = null,
            error: String? = null,
        ) = LockedException(error, message)

        fun failedDependency(
            message: String? = null,
            error: String? = null,
        ) = FailedDependencyException(error, message)

        fun tooEarly(
            message: String? = null,
            error: String? = null,
        ) = TooEarlyException(error, message)

        fun upgradeRequired(
            message: String? = null,
            error: String? = null,
        ) = UpgradeRequiredException(error, message)

        fun preconditionRequired(
            message: String? = null,
            error: String? = null,
        ) = PreconditionRequiredException(error, message)

        fun tooManyRequests(
            message: String? = null,
            error: String? = null,
        ) = TooManyRequestsException(error, message)

        fun requestHeaderFieldsTooLarge(
            message: String? = null,
            error: String? = null,
        ) = RequestHeaderFieldsTooLargeException(error, message)

        fun unavailableForLegalReasons(
            message: String? = null,
            error: String? = null,
        ) = UnavailableForLegalReasonsException(error, message)
    }
}
