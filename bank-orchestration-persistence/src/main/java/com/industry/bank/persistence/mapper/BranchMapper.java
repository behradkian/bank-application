package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.location.AddressEntity;
import com.industry.bank.persistence.entity.user.BranchEntity;
import com.industry.bank.service.repository.dto.AddressRequest;
import com.industry.bank.service.repository.dto.BranchRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BranchMapper {

    BranchMapper INSTANCE = Mappers.getMapper(BranchMapper.class);

    BranchRequest toDto(BranchEntity entity);

    BranchEntity toEntity(BranchRequest requestDto);

    default AddressRequest toDto(AddressEntity entity) {
        if (entity != null)
            return AddressMapper.INSTANCE.toDto(entity);
        return null;
    }

    default AddressEntity toEntity(AddressRequest request) {
        if (request != null)
            return AddressMapper.INSTANCE.toEntity(request);
        return null;
    }
}
