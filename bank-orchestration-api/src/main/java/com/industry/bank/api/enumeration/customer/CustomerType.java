package com.industry.bank.api.enumeration.customer;

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
                .orElse(null);
    }

    public static CustomerType getByValue(String value) {
        if (value != null)
            return Arrays.stream(values()).filter(v -> v.value.equals(value)).findFirst()
                    .orElse(null);
        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
