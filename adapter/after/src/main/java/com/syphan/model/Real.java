package com.syphan.model;

import java.math.BigDecimal;

public class Real {

    private BigDecimal value;

    public Real(BigDecimal value) {
        this.value = value;
    }

    public Real() { }

    public BigDecimal getValue() {
        return value;
    }
}
