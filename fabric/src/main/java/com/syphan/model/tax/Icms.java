package com.syphan.model.tax;

public class Icms implements Tax {

    private static final double FEE = 0.18;
    public static final String NAME = "ICMS";
    private double value;

    public Icms(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value * FEE;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
