package com.agileactors.factory.common.mapper;

import com.agileactors.factory.common.dto.TransportationDto;
import com.agileactors.factory.common.dto.TransportationInput;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransportationMapper {
  TransportationDto toDto(TransportationInput input);
}