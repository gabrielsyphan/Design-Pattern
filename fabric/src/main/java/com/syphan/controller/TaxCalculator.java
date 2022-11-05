package com.syphan.controller;

import com.syphan.model.logger.LoggerFabric;
import com.syphan.model.tax.Tax;

import java.io.IOException;
import java.text.DecimalFormat;

public class TaxCalculator {

    private final LoggerFabric logger;

    public TaxCalculator(LoggerFabric logger) {
        this.logger = logger;
    }

    public void calculate(Tax tax) throws IOException {
        DecimalFormat df = new DecimalFormat("#.##");
        this.logger.show("Calculated value for "+ tax.getName() +" R: "+ df.format(tax.calculate()));
    }
}
