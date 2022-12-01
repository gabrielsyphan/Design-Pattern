package com.syphan.model.order;

import com.syphan.model.billet.Billet;
import com.syphan.model.invoice.Invoice;

public class Order {

    private Billet billet;
    private Invoice invoice;

    public Order(Billet billet, Invoice invoice) {
        this.billet = billet;
        this.invoice = invoice;
    }

    public Billet getBillet() {
        return billet;
    }

    public void setBillet(Billet billet) {
        this.billet = billet;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
