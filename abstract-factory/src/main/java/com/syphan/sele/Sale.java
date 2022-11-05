package com.syphan.sele;

import com.syphan.billet.Billet;
import com.syphan.invoice.Invoice;

public class Sale {

    private final Billet billet;
    private final Invoice invoice;

    public Sale(SaleModuleFactory salesModuleFactory) throws Exception {
        this.billet = salesModuleFactory.createBillet();
        this.invoice = salesModuleFactory.createInvoice();
    }

    public void makeSale() {
        this.invoice.calculateProductTax();
        this.billet.emit(invoice);
    }

    public Billet getBillet() {
        return billet;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
