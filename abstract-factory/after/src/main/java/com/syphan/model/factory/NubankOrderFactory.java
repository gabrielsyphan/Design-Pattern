package com.syphan.model.factory;

import com.syphan.model.billet.Billet;
import com.syphan.model.billet.NubankBillet;
import com.syphan.model.invoice.AlagoasInvoice;
import com.syphan.model.invoice.Invoice;
import com.syphan.model.order.Order;

public class NubankOrderFactory implements OrderFactory {

    @Override
    public Order createOrder() {
        Billet billet = new NubankBillet();
        Invoice invoice = new AlagoasInvoice();
        return new Order(billet, invoice);
    }
}
