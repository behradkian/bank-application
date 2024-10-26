package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.user.UserEntity;
import com.industry.bank.service.repository.dto.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserRequest toDto(UserEntity user);

    UserEntity toEntity(UserRequest userRequest);

}
