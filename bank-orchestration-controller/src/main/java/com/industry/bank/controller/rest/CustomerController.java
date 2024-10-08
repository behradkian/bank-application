package com.industry.bank.controller.rest;

import com.industry.bank.api.facade.CustomerFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController implements CustomerFacade {
}
