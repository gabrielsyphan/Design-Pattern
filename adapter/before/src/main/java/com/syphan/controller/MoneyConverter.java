package com.syphan.controller;

import com.syphan.model.Dolar;
import com.syphan.model.Real;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MoneyConverter {

    public static Dolar realToDolar(Real real) {
        MathContext mathContext = new MathContext(5);
        BigDecimal dolarValue = real.getValue().divide(new BigDecimal("5.33"), mathContext);
        return new Dolar(dolarValue.setScale(2, RoundingMode.HALF_EVEN));
    }
}
