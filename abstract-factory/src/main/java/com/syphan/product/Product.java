package com.syphan.product;

import java.math.BigDecimal;

public class Product {

    private String name;
    private int quantity;
    private BigDecimal value;
    private BigDecimal taxValue;

    public Product(String name, int quantity, BigDecimal value, BigDecimal taxValue) {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
        this.taxValue = taxValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTaxValue() {
        return value;
    }

    public void setTaxValue(BigDecimal taxValue) {
        this.taxValue = taxValue;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getTax() {
        return taxValue;
    }

    public void setTax(BigDecimal taxValue) {
        this.taxValue = taxValue;
    }
}
