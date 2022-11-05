package com.syphan.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public abstract class Invoice {

    private Date dateIssued;
    private long codeNumber;
    private List<Product> productList;

    public Invoice() { }

    public Invoice(Date dateIssued, long codeNumber, List<Product> productList) {
        this.dateIssued = dateIssued;
        this.codeNumber = codeNumber;
        this.productList = productList;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public long getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public abstract BigDecimal calculateTax();
}
