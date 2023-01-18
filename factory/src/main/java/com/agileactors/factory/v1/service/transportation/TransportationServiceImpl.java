package com.agileactors.factory.v1.service.transportation;

import com.agileactors.factory.common.dto.TransportationDto;
import com.agileactors.factory.v1.meansoftransport.Truck;
import com.agileactors.factory.v1.service.tax.TaxService;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransportationServiceImpl implements TransportationService {

  private final TaxService taxService;

  @Override
  public String transportCargo(TransportationDto transportationDto) {
    log.info("Transporting cargo {} of quantity {} and net cost {} via truck...",
        transportationDto.getCargo(), transportationDto.getQuantity(), transportationDto.getCost());

    Truck truck = new Truck();

    truck.checkCargo(transportationDto.getCargo());

    BigDecimal finalPrice =
        taxService.applyTaxesOnCargo(transportationDto.getCargo(), transportationDto.getCost());
    log.info("Final price after taxing is {} ", finalPrice);

    truck.loadCargo(transportationDto.getQuantity());

    truck.sendToDestination(transportationDto.getDestination());

    return "Cargo was transported successfully via truck";
  }
}
