package com.industry.bank.api.facade.user;

import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.dto.user.CreateUserRequestDto;
import com.industry.bank.api.dto.user.CreateUserResponseDto;
import com.industry.bank.api.dto.user.LoginUserRequestDto;
import com.industry.bank.api.dto.user.LoginUserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public interface UserFacade {
    String PATH = "/user";

    @PostMapping(value = "/sign-up"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    CreateUserResponseDto signupUser(@RequestHeader BankOrchestrationRequestHeader<String , Object> headers, @RequestBody CreateUserRequestDto requestDto);

    @GetMapping(value = "/log-in"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    LoginUserResponseDto logInUser(@RequestHeader BankOrchestrationRequestHeader<String , Object> headers, @RequestBody LoginUserRequestDto requestDto);

    @GetMapping(value = "/log-out"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    LoginUserResponseDto logOutUser(@RequestHeader BankOrchestrationRequestHeader<String , Object> headers, @RequestBody LoginUserRequestDto requestDto);

}