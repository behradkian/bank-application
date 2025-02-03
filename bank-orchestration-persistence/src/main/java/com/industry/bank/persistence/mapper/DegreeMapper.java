package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.customer.DegreeEntity;
import com.industry.bank.service.repository.dto.DegreeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author : Pedram Behradkian
 * @date : 2025/02/03
 */
@Mapper(componentModel = "spring")
public interface DegreeMapper {

    DegreeMapper INSTANCE = Mappers.getMapper(DegreeMapper.class);

    DegreeEntity toEntity(DegreeRequest requestDto);

    DegreeRequest toDto(DegreeEntity requestEntity);
}
