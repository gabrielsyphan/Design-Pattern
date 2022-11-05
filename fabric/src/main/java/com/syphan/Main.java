package com.syphan;

import com.syphan.model.logger.LoggerFabric;
import com.syphan.model.logger.LoggerTerminal;
import com.syphan.model.logger.LoggerTxt;
import com.syphan.model.tax.Icms;
import com.syphan.model.tax.Ipva;
import com.syphan.model.tax.Tax;
import com.syphan.controller.TaxCalculator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LoggerFabric loggerTerminal = LoggerTerminal.getLoggerTerminal("Main");
        LoggerFabric loggerTxt = LoggerTxt.getLoggerTxt("Main");

        Tax icms = new Icms(100);
        TaxCalculator calculatorIcms = new TaxCalculator(loggerTerminal);
        calculatorIcms.calculate(icms);

        Tax ipva = new Ipva(83);
        TaxCalculator calculatorIpva = new TaxCalculator(loggerTxt);
        calculatorIpva.calculate(ipva);
    }
}