package com.industry.bank.api.dto.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import com.industry.bank.api.enumeration.general.RelationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "RelatedCustomerDto", title = "", description = "")
public class RelatedCustomerDto {

    private RelationType relation;

    private String customerNumber;

}
