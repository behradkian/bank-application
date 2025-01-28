package com.industry.bank.api.exception.runtime;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/29
 */
public class NotImplementedException extends BankRuntimeException {

    public NotImplementedException(String message) {
        super(message);
    }

    public NotImplementedException() {
        super("this method is not implemented");
    }

}
