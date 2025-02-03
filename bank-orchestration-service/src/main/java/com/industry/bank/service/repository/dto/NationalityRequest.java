package com.industry.bank.service.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Pedram Behradkian
 * @date : 2025/02/03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NationalityRequest {

    private String nationalityId;
    private String nationalityCode;
    private String nationalityName;
    private String nationalityDescription;

}