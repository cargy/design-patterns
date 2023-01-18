package com.agileactors.factory.common.mapper;

import com.agileactors.factory.common.dto.TransportationDto;
import com.agileactors.factory.common.dto.TransportationInput;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransportationMapper {
  TransportationMapper INSTANCE = Mappers.getMapper(TransportationMapper.class);

  TransportationDto toDto(TransportationInput input);
}