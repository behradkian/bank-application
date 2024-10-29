package com.industry.bank.api.dto.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import com.industry.bank.api.enumeration.general.RelationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "RelatedCustomerDto", title = "${RelatedCustomerDto.title}", description = "${RelatedCustomerDto.description}")
public class RelatedCustomerDto {

    @Schema(name = "customerNumber", title = "${RelatedCustomerDto.customerNumber.title}", description = "${RelatedCustomerDto.customerNumber.description}")
    private String customerNumber;

    @Schema(name = "relation", title = "${RelatedCustomerDto.relation.title}", description = "${RelatedCustomerDto.relation.description}")
    private RelationType relation;

}
