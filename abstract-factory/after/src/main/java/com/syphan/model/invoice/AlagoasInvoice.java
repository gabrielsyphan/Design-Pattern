package com.syphan.model.invoice;

import com.syphan.model.product.Product;

import java.util.List;

public class AlagoasInvoice extends InvoiceGeneric implements Invoice {

    @Override
        public void calculateProductTax() {
            System.out.println("Calculating Alagoas tax");
        }
}
