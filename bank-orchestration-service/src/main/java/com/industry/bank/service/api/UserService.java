package com.industry.bank.service.api;


import com.industry.bank.api.dto.user.CreateUserRequestDto;
import com.industry.bank.api.dto.user.RoleDto;
import com.industry.bank.api.dto.user.UserDto;

import java.util.List;

public interface UserService {

    void registerUser(CreateUserRequestDto requestDto);

    void addUser(UserDto user);

    void addRole(RoleDto role);

    void addRoleToUser(String roleName, String username);

    UserDto getUesr(String username);

    List<UserDto> getUsers();
}