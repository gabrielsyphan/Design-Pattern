package com.syphan.util;

import com.syphan.model.Dolar;
import com.syphan.model.Real;

import java.math.BigDecimal;
import java.math.MathContext;

public class RealAdapter extends Dolar {

    private final Real real;

    public RealAdapter(Real real) {
        this.real = real;
    }

    @Override
    public BigDecimal getValue() {
        MathContext mathContext = new MathContext(5);
        return this.real.getValue().divide(new BigDecimal("5.33"), mathContext);
    }
}
