package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.user.RoleEntity;
import com.industry.bank.persistence.entity.user.UserEntity;
import com.industry.bank.service.repository.dto.RoleRequest;
import com.industry.bank.service.repository.dto.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleRequest toRequest(RoleEntity role);

    RoleEntity toEntity(RoleRequest roleRequest);
}
