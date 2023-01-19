package com.agileactors.factory.common.dto;

import java.math.BigDecimal;

public record TransportationDto(String cargo, Double quantity, BigDecimal cost,
                                String pointOfDeparture, String destination) {

}
