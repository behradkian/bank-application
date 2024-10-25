package com.industry.bank.api.enumeration.customer;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum CustomerType implements Serializable {

    REAL(1, "REAL"),
    CORPORATE(2, "CORPORATE");

    private final Integer code;
    private final String value;

    CustomerType(int code , String value){
        this.code = code;
        this.value = value;
    }
    public static CustomerType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in CustomerType is invalid : " + code));
    }

    public static CustomerType getByValue(String value) {
        return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("value in CustomerType is invalid : " + value));
    }

}
