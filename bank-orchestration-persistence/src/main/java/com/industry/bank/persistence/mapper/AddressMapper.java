package com.industry.bank.persistence.mapper;

import com.industry.bank.api.enumeration.general.AddressType;
import com.industry.bank.persistence.entity.location.AddressEntity;
import com.industry.bank.service.repository.dto.AddressRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressRequest toDto(AddressEntity entity);

    AddressEntity toEntity(AddressRequest requestDto);

    default Integer mapAddressType(AddressType type) {
        if (type != null)
            return type.getCode();
        return null;
    }

    default AddressType mapAddressType(Integer type) {
        if (type != null)
            return AddressType.getByCode(type);
        return null;
    }

}
