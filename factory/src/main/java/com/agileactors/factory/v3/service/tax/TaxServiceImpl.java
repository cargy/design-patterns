package com.agileactors.factory.v3.service.tax;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class TaxServiceImpl implements TaxService {

  @Override
  public BigDecimal applyTaxesOnCargo(String cargo, BigDecimal net) {
    if (cargo.startsWith("A")) {
      return net.add(net.multiply(BigDecimal.valueOf(0.13)));
    }
    return net.add(net.multiply(BigDecimal.valueOf(0.23)));
  }
}
