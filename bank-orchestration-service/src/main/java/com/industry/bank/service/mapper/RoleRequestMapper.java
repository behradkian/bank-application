package com.industry.bank.service.mapper;

import com.industry.bank.api.dto.user.RoleDto;
import com.industry.bank.api.dto.user.UserDto;
import com.industry.bank.service.repository.dto.RoleRequest;
import com.industry.bank.service.repository.dto.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RoleRequestMapper {
    RoleRequestMapper INSTANCE = Mappers.getMapper(RoleRequestMapper.class);

    RoleDto toDto(RoleRequest request);

    RoleRequest toRequest(RoleDto roleDto);
}
