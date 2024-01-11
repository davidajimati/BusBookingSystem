package com.stanbic.BusBookingSystem.exception;

import com.stanbic.BusBookingSystem.dto.response.ResponsePayload;
import com.stanbic.BusBookingSystem.exception.defined.InternalServerError;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.slf4j.LoggerFactory.getLogger;


@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionsHandler {
    private final Logger LOGGER = getLogger(GlobalExceptionsHandler.class);
    @ExceptionHandler(InternalServerError.class)
    public ResponseEntity<ResponsePayload> handleInternalServiceError(Exception e) {
        LOGGER.info("****--> an exception occurred in 'enrolNewBus' service");
        return new ResponseEntity<>(new ResponsePayload("99", e.getMessage(), e.getLocalizedMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
