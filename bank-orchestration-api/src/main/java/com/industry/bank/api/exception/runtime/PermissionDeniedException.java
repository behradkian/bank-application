package com.industry.bank.api.exception.runtime;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : Pedram Behradkian
 * @date : 2025/06/19
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class PermissionDeniedException extends BankRuntimeException {
    public PermissionDeniedException(String message) {
        super(message);
    }
}
