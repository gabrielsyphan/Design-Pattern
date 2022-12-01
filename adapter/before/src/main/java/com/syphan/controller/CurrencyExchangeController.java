package com.syphan.controller;

import com.syphan.model.Dolar;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyExchangeController {

    private static final BigDecimal TAX = new BigDecimal("1.25");

    public static BigDecimal calculateTotalValue(Dolar value) {
        BigDecimal totalValue = value.getValue().multiply(TAX);
        return totalValue.setScale(2, RoundingMode.HALF_EVEN);
    }
}
