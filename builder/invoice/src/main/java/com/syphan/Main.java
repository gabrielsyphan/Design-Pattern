package com.syphan;

import com.syphan.model.Builder.InvoiceBuilder;
import com.syphan.model.Invoice;
import com.syphan.model.Product;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        Product product1 = new Product("Sugar", 3, new BigDecimal("3.10"));
        Product product2 = new Product("Meat", 6, new BigDecimal("16.90"));

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        Invoice invoicePf = new InvoiceBuilder().buildInvoicePf()
                .productList(productList)
                .dateIssued("12/12/2022")
                .codeNumber(26)
                .build();

        Invoice invoicePj=  new InvoiceBuilder().buildInvoicePj()
                .productList(productList)
                .dateIssued("13/01/2023")
                .codeNumber(28)
                .build();

        System.out.println(invoicePf.calculateTax());
        System.out.println(invoicePj.calculateTax());
    }
}