package com.industry.bank.service.mapper;

import com.industry.bank.api.dto.user.UserDto;
import com.industry.bank.service.repository.dto.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserRequestMapper {

    UserRequestMapper INSTANCE = Mappers.getMapper(UserRequestMapper.class);

    UserDto toDto(UserRequest request);

    UserRequest toRequest(UserDto userDto);
}
