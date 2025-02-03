package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.user.LicenseEntity;
import com.industry.bank.persistence.entity.user.RoleEntity;
import com.industry.bank.service.repository.dto.LicenseRequest;
import com.industry.bank.service.repository.dto.RoleRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author : Pedram Behradkian
 * @date : 2025/02/03
 */
@Mapper(componentModel = "spring")
public interface LicenceMapper {

    LicenceMapper INSTANCE = Mappers.getMapper(LicenceMapper.class);

    LicenseEntity toEntity(LicenseRequest requestDto);

    LicenseRequest toDto(LicenseEntity requestEntity);

    default RoleEntity toEntity(RoleRequest requestDto) {
        if (requestDto != null)
            return RoleMapper.INSTANCE.toEntity(requestDto);
        return null;
    }

    default RoleRequest toDto(RoleEntity requestEntity) {
        if (requestEntity != null)
            return RoleMapper.INSTANCE.toDto(requestEntity);
        return null;
    }

}