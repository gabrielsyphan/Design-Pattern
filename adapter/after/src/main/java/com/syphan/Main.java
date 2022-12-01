package com.syphan;

import com.syphan.controller.CurrencyExchangeController;
import com.syphan.model.Dolar;
import com.syphan.model.Real;
import com.syphan.util.RealAdapter;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Dolar dolar = new Dolar(new BigDecimal("150"));
        print(CurrencyExchangeController.calculateTotalValue(dolar));

        Real real = new Real(new BigDecimal("20"));

        // This line will not compile because the method calculateTotalValue() is expecting a Dolar object * and not a Real object.
        // print(CurrencyExchangeController.calculateTotalValue(real));

        RealAdapter realAdapter = new RealAdapter(real);
        print(CurrencyExchangeController.calculateTotalValue(realAdapter));
    }

    private static void print(BigDecimal value) {
        System.out.println("Total price with office exchange tax is: $" + value);
    }
}