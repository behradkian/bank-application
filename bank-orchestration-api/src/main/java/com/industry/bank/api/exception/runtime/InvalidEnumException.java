package com.industry.bank.api.exception.runtime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST , reason = "Invalid Input Data")
public class InvalidEnumException extends BankRuntimeException {

    public InvalidEnumException() {
    }

    public InvalidEnumException(String message) {
        super(message);
    }

    public InvalidEnumException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEnumException(Throwable cause) {
        super(cause);
    }
}

