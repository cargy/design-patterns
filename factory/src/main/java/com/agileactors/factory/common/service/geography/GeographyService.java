package com.agileactors.factory.common.service.geography;

import com.agileactors.factory.common.enums.MeansOfTransportationEnum;

public interface GeographyService {

  MeansOfTransportationEnum getMeansOfTransportation(String pointOfDeparture,
                                                            String destination);
}
