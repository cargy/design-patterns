package com.agileactors.factory.v3.service.transportation;

import com.agileactors.factory.common.dto.TransportationDto;
import com.agileactors.factory.common.enums.MeansOfTransportationEnum;
import com.agileactors.factory.common.service.geography.GeographyService;
import com.agileactors.factory.common.service.tax.TaxService;
import com.agileactors.factory.v3.factory.MeansOfTransportFactory;
import com.agileactors.factory.v3.meansoftransport.MeansOfTransport;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("TransportationServiceImplV3")
@RequiredArgsConstructor
@Slf4j
public class TransportationServiceImpl implements TransportationService {

  private final TaxService taxService;
  private final GeographyService geographyService;

  @Override
  public String transportCargo(TransportationDto transportationDto) {

    MeansOfTransportationEnum meansOfTransportEnum =
        geographyService.getMeansOfTransportation(transportationDto.getPointOfDeparture(),
            transportationDto.getDestination());

    MeansOfTransport meansOfTransport =
        MeansOfTransportFactory.getMeansOfTransport(meansOfTransportEnum);

    log.info("Transporting cargo {} of quantity {} and net cost {} via {}...",
        transportationDto.getCargo(), transportationDto.getQuantity(), transportationDto.getCost(),
        meansOfTransport);

    meansOfTransport.checkCargo(transportationDto.getCargo());

    BigDecimal finalPrice =
        taxService.applyTaxesOnCargo(transportationDto.getCargo(), transportationDto.getCost());
    log.info("Final price after taxing is {} ", finalPrice);

    meansOfTransport.loadCargo(transportationDto.getQuantity());
    meansOfTransport.sendToDestination(transportationDto.getDestination());

    return "Cargo was transported successfully via " + meansOfTransportEnum;
  }

}
