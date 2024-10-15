package com.industry.bank.controller.advice;

import com.industry.bank.api.exception.checked.BankException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {

    // Handle NullPointerException
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> handleNullPointerException(NullPointerException ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ExceptionDto exceptionDto = new ExceptionDto(
                ex.getMessage(),
                ex,
                status,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(exceptionDto, status);
    }

    // Handle IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ExceptionDto exceptionDto = new ExceptionDto(
                ex.getMessage(),
                ex,
                status,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(exceptionDto, status);
    }

    // Handle BankException (checked)
    @ExceptionHandler(BankException.class)
    public ResponseEntity<Object> handleGlobalException(BankException bankException) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        ExceptionDto exceptionDto = new ExceptionDto(
                bankException.getMessage(),
                bankException,
                status,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(exceptionDto, status);
    }
}
