package com.industry.bank.service.repository.dto;

import com.industry.bank.api.enumeration.customer.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    private String customerId;
    private CustomerType customerType;
    private String customerNumber;
    private Date customerRegisterDate;
}