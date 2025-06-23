package com.industry.bank.api.exception.runtime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/29
 */
@ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED)
public class NotImplementedException extends BankRuntimeException {

    public NotImplementedException(String message) {
        super(message);
    }

    public NotImplementedException() {
        super("this method is not implemented");
    }

}
