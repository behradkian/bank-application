package com.industry.bank.persistence.mapper.customer;

import com.industry.bank.persistence.entity.customer.CustomerEntity;
import com.industry.bank.service.repository.dto.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author : Pedram Behradkian
 * @date : 2025/03/02
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerRequest toDto(CustomerEntity entity);

    CustomerEntity toEntity(CustomerRequest requestDto);

}