package com.agileactors.factory.v3.service.geography;


import com.agileactors.factory.common.enums.MeansOfTransportationEnum;

public interface GeographyService {

  public MeansOfTransportationEnum getMeansOfTransport(String pointOfDeparture, String destination);
}
