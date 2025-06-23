package com.industry.bank.api.exception.checked;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/29
 */
@ResponseStatus(value = HttpStatus.GATEWAY_TIMEOUT)
public class CustomerExistedException extends BankException {
    public CustomerExistedException(String message) {
        super(message);
    }
}
