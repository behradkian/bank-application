package com.industry.bank.api.enumeration.general;


import com.industry.bank.api.exception.runtime.InvalidEnumException;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
@Schema(enumAsRef = true, title = "${RelationType.title}", description = "${RelationType.description}")
public enum RelationType {

    @Schema(enumAsRef = true, title = "${RelationType.guardian.title}", description = "${RelationType.guardian.description}")
    GUARDIAN(0), //وصی یا قیم
    @Schema(enumAsRef = true, title = "${RelationType.joint_account_holder.title}", description = "${RelationType.joint_account_holder.description}")
    JOINT_ACCOUNT_HOLDER(1), // هم مالک
    @Schema(enumAsRef = true, title = "${RelationType.legal_representative.title}", description = "${RelationType.legal_representative.description}")
    LEGAL_REPRESENTATIVE(2), // نماینده قانونی
    @Schema(enumAsRef = true, title = "${RelationType.guarantor.title}", description = "${RelationType.guarantor.description}")
    GUARANTOR(3), // ضامن
    @Schema(enumAsRef = true, title = "${RelationType.dependent_customer.title}", description = "${RelationType.dependent_customer.description}")
    DEPENDENT_CUSTOMER(4), // مشتری وابسته
    @Schema(enumAsRef = true, title = "${RelationType.introducer.title}", description = "${RelationType.introducer.description}")
    INTRODUCER(5), // معرف
    @Schema(enumAsRef = true, title = "${RelationType.business_partner.title}", description = "${RelationType.business_partner.description}")
    BUSINESS_PARTNER(6); // شریک تجاری

    private Integer code;

    RelationType(int code){
        this.code = code;
    }

    public static RelationType getByCode(int code) {
        return Arrays.stream(values()).filter(v -> v.code.equals(code)).findFirst()
                .orElseThrow(() -> new InvalidEnumException("code in RelationType is invalid : " + code));
    }
}
