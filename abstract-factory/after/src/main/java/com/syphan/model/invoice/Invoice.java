package com.syphan.model.invoice;

import com.syphan.model.product.Product;

import java.util.List;

public interface Invoice  {

    public List<Product> getProducts();

    public void addListProduct(List<Product> products);

    public void calculateProductTax();
}
