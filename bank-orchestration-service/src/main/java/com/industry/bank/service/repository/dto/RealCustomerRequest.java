package com.industry.bank.service.repository.dto;

import com.industry.bank.api.enumeration.general.GenderType;
import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/28
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealCustomerRequest {

    private String realCustomerId;
    private String nationalCode;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String mobileNumber;
    private String email;
    private GenderType gender;
    private DegreeRequest degree;
    private OccupationRequest occupation;
    private List<AddressRequest> addresses;

}