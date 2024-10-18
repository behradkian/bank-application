package com.industry.bank.controller.rest.general;

import com.industry.bank.api.facade.general.GeneralFacade;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "general services")
@RequestMapping(path = GeneralFacade.PATH)
public class GeneralController implements GeneralFacade {

}
