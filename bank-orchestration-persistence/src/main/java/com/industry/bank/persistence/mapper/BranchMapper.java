package com.industry.bank.persistence.mapper;

import com.industry.bank.persistence.entity.user.BranchEntity;
import com.industry.bank.service.repository.dto.BranchRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BranchMapper {

    BranchMapper INSTANCE = Mappers.getMapper(BranchMapper.class);

    BranchRequest toDto(BranchEntity entity);

    BranchEntity toEntity(BranchRequest requestDto);
}
