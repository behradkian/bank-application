package com.industry.bank.persistence.mapper.customer;

import com.industry.bank.persistence.entity.general.DegreeEntity;
import com.industry.bank.persistence.entity.customer.RealCustomerEntity;
import com.industry.bank.persistence.entity.general.AddressEntity;
import com.industry.bank.persistence.mapper.general.AddressMapper;
import com.industry.bank.persistence.mapper.general.DegreeMapper;
import com.industry.bank.service.repository.dto.AddressRequest;
import com.industry.bank.service.repository.dto.DegreeRequest;
import com.industry.bank.service.repository.dto.RealCustomerRequest;
import org.mapstruct.Mapper;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/28
 */
@Mapper(componentModel = "spring")
public interface RealCustomerMapper extends CustomerMapper {

    RealCustomerEntity toEntity(RealCustomerRequest requestDto);

    RealCustomerRequest toDto(RealCustomerEntity requestEntity);

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

    default DegreeRequest toDto(DegreeEntity entity) {
        if (entity != null)
            return DegreeMapper.INSTANCE.toDto(entity);
        return null;
    }

    default DegreeEntity toEntity(DegreeRequest request) {
        if (request != null)
            return DegreeMapper.INSTANCE.toEntity(request);
        return null;
    }
}
