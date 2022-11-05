package com.syphan.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class InvoicePJ extends Invoice {

    private static final BigDecimal TAX = new BigDecimal("0.04");

    public InvoicePJ(Date dateIssued, long codeNumber, List<Product> productList) {
        super(dateIssued, codeNumber, productList);
    }

    public InvoicePJ() { }

    @Override
    public BigDecimal calculateTax() {
        BigDecimal value = BigDecimal.ZERO;
        value = this.getProductList().stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        value = value.multiply(TAX);

        return value;
    }
}
