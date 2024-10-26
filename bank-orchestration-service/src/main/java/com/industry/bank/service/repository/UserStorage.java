package com.industry.bank.service.repository;

import com.industry.bank.api.dto.user.RoleDto;
import com.industry.bank.api.dto.user.UserDto;
import com.industry.bank.service.repository.dto.RoleRequest;
import com.industry.bank.service.repository.dto.UserRequest;

public interface UserStorage {

    UserRequest saveUser(UserDto user);

    RoleRequest saveRole(RoleDto role);

    void addRoleToUser(RoleRequest roleName, UserRequest userName);

}
