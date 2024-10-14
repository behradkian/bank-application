package com.industry.bank.api.exception.runtime;

public abstract class BankRuntimeException extends RuntimeException {

    public BankRuntimeException() {
    }

    public BankRuntimeException(String message) {
        super(message);
    }

    public BankRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BankRuntimeException(Throwable cause) {
        super(cause);
    }

}
