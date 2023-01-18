package com.agileactors.factory.v2.service.geography;

import com.agileactors.factory.common.enums.MeansOfTransportationEnum;

public interface GeographyService {

  public MeansOfTransportationEnum getMeansOfTransportation(String pointOfDeparture,
                                                            String destination);
}
