package com.syphan.billet;

import com.syphan.invoice.Invoice;

public interface Billet {

    public void emit(Invoice invoice);
}
