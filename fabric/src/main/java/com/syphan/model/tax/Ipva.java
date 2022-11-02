package com.syphan.model.tax;

public class Ipva implements Tax {

    private static final double FEE = 0.04;
    private static final String NAME = "IPVA";
    private double value;

    public Ipva(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return this.value * FEE;
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
