package com.agileactors.factory.v3.service.tax;

import java.math.BigDecimal;

public interface TaxService {

  public BigDecimal applyTaxesOnCargo(String cargo, BigDecimal net);
}
