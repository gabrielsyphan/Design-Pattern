package com.syphan.model.product;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String description;
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = new BigDecimal(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
