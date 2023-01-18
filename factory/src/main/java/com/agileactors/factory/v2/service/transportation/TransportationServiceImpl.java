package com.agileactors.factory.v2.service.transportation;

import com.agileactors.factory.common.dto.TransportationDto;
import com.agileactors.factory.common.enums.MeansOfTransportationEnum;
import com.agileactors.factory.v2.meansoftransportation.Airplane;
import com.agileactors.factory.v2.meansoftransportation.Boat;
import com.agileactors.factory.v2.meansoftransportation.Truck;
import com.agileactors.factory.v2.service.geography.GeographyService;
import com.agileactors.factory.v2.service.tax.TaxService;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransportationServiceImpl implements TransportationService {

  private final TaxService taxService;
  private final GeographyService geographyService;

  @Override
  public String transportCargo(TransportationDto transportationDto) {

    MeansOfTransportationEnum meansOfTransportationEnum =
        geographyService.getMeansOfTransportation(transportationDto.getPointOfDeparture(),
            transportationDto.getDestination());
    log.info("Transporting cargo {} of quantity {} and net cost {} via {}...",
        transportationDto.getCargo(), transportationDto.getQuantity(), transportationDto.getCost(),
        meansOfTransportationEnum);

    Airplane airplane = new Airplane();
    Boat boat = new Boat();
    Truck truck = new Truck();

    if (MeansOfTransportationEnum.AIRPLANE.equals(meansOfTransportationEnum)) {
      airplane.checkCargo(transportationDto.getCargo());
    } else if (MeansOfTransportationEnum.BOAT.equals(meansOfTransportationEnum)) {
      boat.checkCargo(transportationDto.getCargo());
    } else {
      truck.checkCargo(transportationDto.getCargo());
    }

    BigDecimal finalPrice =
        taxService.applyTaxesOnCargo(transportationDto.getCargo(), transportationDto.getCost());
    log.info("Final price after taxing is {} ", finalPrice);

    if (MeansOfTransportationEnum.AIRPLANE.equals(meansOfTransportationEnum)) {
      airplane.loadCargo(transportationDto.getQuantity());
      airplane.sendToDestination(transportationDto.getDestination());
    } else if (MeansOfTransportationEnum.BOAT.equals(meansOfTransportationEnum)) {
      boat.loadCargo(transportationDto.getQuantity());
      boat.sendToDestination(transportationDto.getDestination());
    } else {
      truck.loadCargo(transportationDto.getQuantity());
      truck.sendToDestination(transportationDto.getDestination());
    }

    return "Cargo was transported successfully via " + meansOfTransportationEnum;
  }
}
