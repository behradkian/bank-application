package com.industry.bank.api.dto.general;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestHeader {
    private String userCode;
    private String branchCode;
}
