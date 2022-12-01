package com.syphan.model.invoice;

import com.syphan.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class InvoiceGeneric {

    protected InvoiceGeneric() {}

    protected InvoiceGeneric(List<Product> products) {
        this.products = products;
    }

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void addListProduct(List<Product> products) {
        this.products.addAll(products);
    }

    public List<Product> getProducts() {
        return products;
    }
}
