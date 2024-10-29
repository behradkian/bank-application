package com.industry.bank.api.enumeration.customer;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum CustomerType implements Serializable {

    REAL(1, "REAL"),
    CORPORATE(2, "CORPORATE");

    private final Integer code;
    private final String value;

    public static CustomerType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in CustomerType is invalid : " + code));
    }

    public static CustomerType getByValue(String value) {
        if (value != null)
            return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                    .orElseThrow(() -> new InvalidEnumException("value in CustomerType is invalid : " + value));
        return null;
    }

}
