package com.syphan.model;

import java.math.BigDecimal;

public class Dolar {
    private BigDecimal value;

    public Dolar(BigDecimal value) {
        this.value = value;
    }

    public Dolar() { }

    public BigDecimal getValue() {
        return value;
    }
}
