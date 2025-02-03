package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.user.LicenseEntity;
import com.industry.bank.persistence.entity.user.RoleEntity;
import com.industry.bank.persistence.entity.user.UserEntity;
import com.industry.bank.service.repository.dto.LicenseRequest;
import com.industry.bank.service.repository.dto.RoleRequest;
import com.industry.bank.service.repository.dto.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleRequest toDto(RoleEntity requestEntity);

    RoleEntity toEntity(RoleRequest requestDto);

    default UserRequest toDto(UserEntity requestEntity) {
        if (requestEntity != null)
            return UserMapper.INSTANCE.toRequest(requestEntity);
        return null;
    }

    default UserEntity toEntity(UserRequest requestDto){
        if(requestDto != null)
            return UserMapper.INSTANCE.toEntity(requestDto);
        return null;
    }

    default LicenseRequest toDto(LicenseEntity requestEntity){
        if(requestEntity != null)
            return LicenceMapper.INSTANCE.toDto(requestEntity);
        return null;
    }

    default LicenseEntity toEntity(LicenseRequest requestDto){
        if(requestDto != null)
            return LicenceMapper.INSTANCE.toEntity(requestDto);
        return null;
    }
}