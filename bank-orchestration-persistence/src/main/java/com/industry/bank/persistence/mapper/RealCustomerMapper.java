package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.customer.RealCustomerEntity;
import com.industry.bank.service.repository.dto.RealCustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author : Pedram Behradkian
 * @date : 2025/01/28
 */
@Mapper(componentModel = "spring")
public interface RealCustomerMapper {

    RealCustomerMapper INSTANCE = Mappers.getMapper(RealCustomerMapper.class);

    RealCustomerEntity toEntity(RealCustomerRequest requestDto);

    RealCustomerRequest toDto(RealCustomerEntity requestEntity);

}
