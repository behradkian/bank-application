package com.industry.bank.persistence.mapper.customer;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author : Pedram Behradkian
 * @date : 2025/03/02
 */
@Mapper(componentModel = "spring")
public interface CorporateCustomerMapper {

    CorporateCustomerMapper INSTANCE = Mappers.getMapper(CorporateCustomerMapper.class);

}