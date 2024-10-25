package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.user.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    com.industry.bank.service.repository.dto.UserDto mapToDto(UserEntity user);
    UserEntity mapToEntity(com.industry.bank.service.repository.dto.UserDto userDto);
}
