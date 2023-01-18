package com.agileactors.factory.common.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TransportationDto {

  private String cargo;
  private Double quantity;
  private BigDecimal cost;
  private String pointOfDeparture;
  private String destination;
}
