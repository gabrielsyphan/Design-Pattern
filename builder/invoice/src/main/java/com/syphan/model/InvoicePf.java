package com.syphan.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class InvoicePf extends Invoice {

    private static final BigDecimal TAX = new BigDecimal("0.07");

    public InvoicePf(Date dateIssued, long codeNumber, List<Product> productList) {
        super(dateIssued, codeNumber, productList);
    }

    public InvoicePf() { }

    @Override
    public BigDecimal calculateTax() {
        BigDecimal value = BigDecimal.ZERO;
        value = this.getProductList().stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        value = value.multiply(TAX);

        return value;
    }
}
