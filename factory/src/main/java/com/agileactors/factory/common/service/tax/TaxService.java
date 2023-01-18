package com.agileactors.factory.common.service.tax;

import java.math.BigDecimal;

public interface TaxService {

  public BigDecimal applyTaxesOnCargo(String cargo, BigDecimal net);
}
