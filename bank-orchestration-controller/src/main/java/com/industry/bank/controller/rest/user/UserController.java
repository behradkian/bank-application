package com.industry.bank.controller.rest.user;

import com.industry.bank.api.dto.general.BankOrchestrationRequestHeader;
import com.industry.bank.api.dto.user.CreateUserRequestDto;
import com.industry.bank.api.dto.user.CreateUserResponseDto;
import com.industry.bank.api.dto.user.LoginUserRequestDto;
import com.industry.bank.api.dto.user.LoginUserResponseDto;
import com.industry.bank.api.facade.user.UserApi;
import com.industry.bank.service.api.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Tag(name = "user services")
@RequestMapping(path = UserApi.PATH)
public class UserController implements UserApi {

    private final UserService userService;

    @Operation(operationId = "signupUser", summary = "ثبت نام کاربر", description = "ثبت نام کاربر", responses = {
            @ApiResponse(responseCode = "200", description = "Successful"),
            @ApiResponse(responseCode = "400", description = "Failed")
    })
    @Override
    public CreateUserResponseDto signupUser(BankOrchestrationRequestHeader<String, Object> headers, CreateUserRequestDto requestDto) {
        userService.addUser(requestDto.getUser());
        return null;
    }

    @Operation(operationId = "logInUser", summary = "لاگین کاربر", description = "لاگین کاربر", responses = {
            @ApiResponse(responseCode = "200", description = "Successful"),
            @ApiResponse(responseCode = "400", description = "Failed")
    })
    @Override
    public LoginUserResponseDto logInUser(BankOrchestrationRequestHeader<String, Object> headers, LoginUserRequestDto requestDto) {
        return null;
    }

    @Operation(operationId = "logOutUser", summary = "لاگ اوت کاربر", description = "لاگ اوت کاربر", responses = {
            @ApiResponse(responseCode = "200", description = "Successful"),
            @ApiResponse(responseCode = "400", description = "Failed")
    })
    @Override
    public LoginUserResponseDto logOutUser(BankOrchestrationRequestHeader<String, Object> headers, LoginUserRequestDto requestDto) {
        return null;
    }

}