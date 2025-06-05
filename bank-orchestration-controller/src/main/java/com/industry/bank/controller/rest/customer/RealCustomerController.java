package com.industry.bank.controller.rest.customer;

import com.industry.bank.api.dto.customer.*;
import com.industry.bank.api.dto.general.BankRequestHeader;
import com.industry.bank.api.dto.general.OccupationDto;
import com.industry.bank.api.exception.checked.CustomerExistedException;
import com.industry.bank.api.facade.customer.RealCustomerApi;
import com.industry.bank.service.api.CustomerService;
import com.industry.bank.service.api.GeneralService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RestController
@Tag(name = "${RealCustomer.Services}")
@RequestMapping(path = RealCustomerApi.PATH)
public class RealCustomerController implements RealCustomerApi {

    private final CustomerService customerService;
    private final GeneralService generalService;


    @Override
    public CreateGeneralCustomerResponseDto createRealCustomer(BankRequestHeader<String, Object> headers, CreateRealCustomerRequestDto realCustomerRequestDto) throws CustomerExistedException {
        return customerService.createRealCustomer(realCustomerRequestDto);
    }

    @Override
    public GetRealCustomerResponseDto getRealCustomer(BankRequestHeader<String, Object> headers, String customerNumber) {
        return customerService.getRealCustomer(customerNumber);
    }

    @Override
    public UpdateRealCustomerResponseDto updateRealCustomer(BankRequestHeader<String, Object> headers, UpdateRealCustomerRequestDto realCustomerRequestDto) {
        return customerService.updateRealCustomer(realCustomerRequestDto);
    }

    @Override
    public DeleteRealCustomerResponseDto deleteRealCustomer(BankRequestHeader<String, Object> headers, String customerNumber) {
        return customerService.deleteRealCustomer(customerNumber);
    }


    @Override
    public List<OccupationDto> getAllOccupations(Map<String, Object> headers) {
        return generalService.getOccupations();
    }

    @Override
    public OccupationDto getOccupation(Map<String, Object> headers, String occupationCode) {
        return  generalService.getOccupation(occupationCode);
    }

}