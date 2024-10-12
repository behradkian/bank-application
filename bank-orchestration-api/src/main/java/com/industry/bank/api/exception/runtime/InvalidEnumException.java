package com.industry.bank.api.exception.runtime;

public class InvalidEnumException extends GlobalRuntimeException {

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

