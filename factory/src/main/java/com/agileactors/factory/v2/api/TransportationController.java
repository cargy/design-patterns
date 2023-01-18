package com.agileactors.factory.v2.api;

import com.agileactors.factory.common.dto.TransportationDto;
import com.agileactors.factory.common.dto.TransportationInput;
import com.agileactors.factory.common.mapper.TransportationMapper;
import com.agileactors.factory.v2.service.transportation.TransportationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v2/transportation")
public class TransportationController {

  private final TransportationService transportationService;

  @PostMapping(value = "/")
  @ResponseStatus(HttpStatus.OK)
  public String transportCargo(@RequestBody TransportationInput transportationInput) {

    TransportationDto transportationDto = TransportationMapper.INSTANCE.toDto(transportationInput);

    return transportationService.transportCargo(transportationDto);
  }
}
