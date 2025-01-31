package com.industry.bank.service.repository.dto;

import com.industry.bank.api.enumeration.customer.DegreeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DegreeRequest {

    private String degreeId;
    private String degreeCode;
    private DegreeType degreeName;

}
