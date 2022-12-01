package com.syphan.model.invoice;

public class AlagoasInvoice extends InvoiceGeneric implements Invoice {

    @Override
        public void calculateProductTax() {
            System.out.println("Calculating Alagoas tax");
        }
}
