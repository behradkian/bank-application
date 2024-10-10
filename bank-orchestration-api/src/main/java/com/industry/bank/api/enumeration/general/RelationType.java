package com.industry.bank.api.enumeration.general;


import com.industry.bank.api.exception.runtime.InvalidEnumException;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum RelationType {

    GUARDIAN(0), //وصی یا قیم
    JOINT_ACCOUNT_HOLDER(1), // هم مالک
    LEGAL_REPRESENTATIVE(2), // نماینده قانونی
    GUARANTOR(3), // ضامن
    DEPENDENT_CUSTOMER(4), // مشتری وابسته
    INTRODUCER(5), // معرف
    BUSINESS_PARTNER(6); // شریک تجاری

    private Integer code;

    public static RelationType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in RelationType is invalid : " + code));
    }
}
