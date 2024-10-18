package com.industry.bank.controller.rest.deposit;

import com.industry.bank.api.facade.CustomerFacade;
import com.industry.bank.api.facade.DepositFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = DepositFacade.PATH)
public class DepositController implements DepositFacade {
}
