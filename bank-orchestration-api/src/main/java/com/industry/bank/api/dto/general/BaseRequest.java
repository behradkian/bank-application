package com.industry.bank.api.dto.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRequest {

    //todo remove because the header is in restApi and it does not need exist in body
    RequestHeader requestHeader;
}