package com.agileactors.factory.v3.service.geography;

import com.agileactors.factory.common.enums.MeansOfTransportationEnum;
import org.springframework.stereotype.Service;

@Service
public class GeographyServiceImpl implements GeographyService {

  @Override
  public MeansOfTransportationEnum getMeansOfTransport(String pointOfDeparture,
                                                       String destination) {
    if (pointOfDeparture.compareTo(destination) > 0) {
      return MeansOfTransportationEnum.BOAT;
    } else if (pointOfDeparture.length() > 10) {
      return MeansOfTransportationEnum.AIRPLANE;
    } else {
      return MeansOfTransportationEnum.TRUCK;
    }
  }
}
