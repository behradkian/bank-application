package com.industry.bank.api.exception.runtime;

public abstract class GlobalRuntimeException extends RuntimeException {

    public GlobalRuntimeException() {
    }

    public GlobalRuntimeException(String message) {
        super(message);
    }

    public GlobalRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalRuntimeException(Throwable cause) {
        super(cause);
    }

}
