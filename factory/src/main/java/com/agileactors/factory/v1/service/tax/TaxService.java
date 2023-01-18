package com.agileactors.factory.v1.service.tax;

import java.math.BigDecimal;

public interface TaxService {

  BigDecimal applyTaxesOnCargo(String cargo, BigDecimal net);
}
