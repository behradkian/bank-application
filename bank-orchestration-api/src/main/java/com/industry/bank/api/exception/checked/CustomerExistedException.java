package com.industry.bank.api.exception.checked;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/29
 */
public class CustomerExistedException extends BankException {
    public CustomerExistedException(String message) {
        super(message);
    }
}
