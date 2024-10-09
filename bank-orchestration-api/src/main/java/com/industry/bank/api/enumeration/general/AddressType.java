package com.industry.bank.api.enumeration.general;

import com.industry.bank.api.exception.runtime.InvalidEnumException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum AddressType implements Serializable {

    HOME(1),
    WORK(2);

    private final Integer code;

    public static AddressType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in AddressType is invalid : " + code));
    }

}