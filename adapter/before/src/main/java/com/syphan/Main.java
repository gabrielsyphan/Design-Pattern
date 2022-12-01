package com.syphan;

import com.syphan.controller.CurrencyExchangeController;
import com.syphan.controller.MoneyConverter;
import com.syphan.model.Dolar;
import com.syphan.model.Real;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Dolar dolar = new Dolar(new BigDecimal("150"));
        print(CurrencyExchangeController.calculateTotalValue(dolar));

        Real real = new Real(new BigDecimal("20"));
        Dolar realConvertedToDolar = MoneyConverter.realToDolar(real);
        print(CurrencyExchangeController.calculateTotalValue(realConvertedToDolar));
    }

    private static void print(BigDecimal value) {
        System.out.println("Total price with office exchange tax is: $" + value);
    }
}