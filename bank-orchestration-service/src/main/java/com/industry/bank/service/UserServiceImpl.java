package com.industry.bank.service;

import com.industry.bank.api.dto.user.CreateUserRequestDto;
import com.industry.bank.api.dto.user.RoleDto;
import com.industry.bank.api.dto.user.UserDto;
import com.industry.bank.service.api.UserService;
import com.industry.bank.service.mapper.RoleRequestMapper;
import com.industry.bank.service.mapper.UserRequestMapper;
import com.industry.bank.service.repository.dto.RoleRequest;
import com.industry.bank.service.repository.dto.UserRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    //private final UserStorage userStorage;

    @Override
    public void registerUser(CreateUserRequestDto requestDto) {
        addUser(requestDto.getUser());
        addRole(requestDto.getRole());
        addRoleToUser(requestDto.getRole().getName() , requestDto.getUser().getUsername());
    }

    @Override
    public void addUser(UserDto user) {
        UserRequest userRequest = UserRequestMapper.INSTANCE.toRequest(user);
        //userStorage.saveUser(userRequest);
    }

    @Override
    public void addRole(RoleDto role) {
        RoleRequest request = RoleRequestMapper.INSTANCE.toRequest(role);
        //userStorage.saveRole(request);
    }

    @Override
    public void addRoleToUser(String roleName, String username) {
        //userStorage.addRoleToUser(roleName , username);
    }

    @Override
    public UserDto getUesr(String username) {
        //UserDto userDto = UserRequestMapper.INSTANCE.toDto(userStorage.getUser(username));
        return UserRequestMapper.INSTANCE.toDto(null);
    }

    @Override
    public List<UserDto> getUsers() {
        List<UserDto> userDtoList = new ArrayList<>();
        /*userStorage.getUsers().stream().forEach(x -> {
            UserDto userDto = UserRequestMapper.INSTANCE.toDto(x);
            userDtoList.add(userDto);
        });*/
        return userDtoList;
    }
}