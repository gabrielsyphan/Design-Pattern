package com.syphan.model.invoice;

public class RecifeInvoice extends InvoiceGeneric implements Invoice {

    @Override
    public void calculateProductTax() {
        System.out.println("Calculating Recife tax");
    }
}
