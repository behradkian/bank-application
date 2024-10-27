package com.industry.bank.service.repository;

import com.industry.bank.api.dto.user.RoleDto;
import com.industry.bank.api.dto.user.UserDto;
import com.industry.bank.service.repository.dto.RoleRequest;
import com.industry.bank.service.repository.dto.UserRequest;

import java.util.List;

public interface UserStorage {

    void saveUser(UserRequest user);

    void saveRole(RoleRequest role);

    void addRoleToUser(String roleName, String username);

    UserRequest getUser(String username);

    List<UserRequest> getUsers();

}
