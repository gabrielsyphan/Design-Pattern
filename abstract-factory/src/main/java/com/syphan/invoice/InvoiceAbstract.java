package com.syphan.invoice;

import com.syphan.product.Product;

import java.util.List;

public abstract class InvoiceAbstract implements Invoice {
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
