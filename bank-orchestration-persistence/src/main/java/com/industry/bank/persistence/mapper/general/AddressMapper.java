package com.industry.bank.persistence.mapper.general;

import com.industry.bank.api.enumeration.general.AddressType;
import com.industry.bank.persistence.entity.general.AddressEntity;
import com.industry.bank.service.repository.dto.AddressRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressRequest toDto(AddressEntity entity);

    AddressEntity toEntity(AddressRequest requestDto);

    default Integer mapAddressType(AddressType type) {
        return type.getCode();
    }

    default AddressType mapAddressType(Integer type) {
        return AddressType.getByCode(type);
    }

}
