package com.syphan.model.factory;

import com.syphan.model.billet.Billet;
import com.syphan.model.billet.C6Billet;
import com.syphan.model.invoice.Invoice;
import com.syphan.model.invoice.RecifeInvoice;
import com.syphan.model.order.Order;

public class C6OrderFactory implements OrderFactory {

    @Override
    public Order createOrder() {
        Billet billet = new C6Billet();
        Invoice invoice = new RecifeInvoice();
        return new Order(billet, invoice);
    }
}
