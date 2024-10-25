package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.user.UserEntity;
import com.industry.bank.service.repository.dto.userRequest;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    userRequest mapToDto(UserEntity user);
    UserEntity mapToEntity(userRequest userRequest);
}
