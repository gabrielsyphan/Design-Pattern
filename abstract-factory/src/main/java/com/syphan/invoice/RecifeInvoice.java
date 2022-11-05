package com.syphan.invoice;

import java.math.BigDecimal;

public class RecifeInvoice extends InvoiceAbstract {

    private static final BigDecimal TAX = new BigDecimal("0.14");

    @Override
    public void calculateProductTax() {
        this.getProductList().forEach(product -> {
            product.setTaxValue(product.getTaxValue().multiply(TAX));
        });
    }
}
