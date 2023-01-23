package com.agileactors.factory.v3.factory;

import com.agileactors.factory.common.enums.MeansOfTransportationEnum;
import com.agileactors.factory.v3.meansoftransportation.Airplane;
import com.agileactors.factory.v3.meansoftransportation.Boat;
import com.agileactors.factory.v3.meansoftransportation.MeansOfTransport;
import com.agileactors.factory.v3.meansoftransportation.Truck;

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
