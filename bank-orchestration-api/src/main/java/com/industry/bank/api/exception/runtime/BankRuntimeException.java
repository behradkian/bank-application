package com.industry.bank.api.exception.runtime;

public abstract class BankRuntimeException extends RuntimeException {

    protected BankRuntimeException() {
    }

    protected BankRuntimeException(String message) {
        super(message);
    }

    protected BankRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    protected BankRuntimeException(Throwable cause) {
        super(cause);
    }

}
