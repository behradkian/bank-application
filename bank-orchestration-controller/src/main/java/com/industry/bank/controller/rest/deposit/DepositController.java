package com.industry.bank.controller.rest.deposit;

import com.industry.bank.api.facade.deposit.DepositFacade;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "deposit services")
@RequestMapping(path = DepositFacade.PATH)
public class DepositController implements DepositFacade {
}
