package com.agileactors.factory.v3.factory;

import com.agileactors.factory.common.enums.MeansOfTransportationEnum;
import com.agileactors.factory.v3.meansoftransport.Airplane;
import com.agileactors.factory.v3.meansoftransport.Boat;
import com.agileactors.factory.v3.meansoftransport.MeansOfTransport;
import com.agileactors.factory.v3.meansoftransport.Truck;

public class MeansOfTransportFactory {

  private MeansOfTransportFactory() {
  }

  public static MeansOfTransport getMeansOfTransport(
      MeansOfTransportationEnum meansOfTransportationEnum) {

    return switch (meansOfTransportationEnum) {
      case AIRPLANE -> new Airplane();
      case BOAT -> new Boat();
      default -> new Truck();
    };
  }
}
