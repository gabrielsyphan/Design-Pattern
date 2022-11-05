package com.syphan.sele;

import com.syphan.billet.Billet;
import com.syphan.invoice.Invoice;

public interface SaleModuleFactory {

    public Billet createBillet() throws Exception;
    public Invoice createInvoice() throws Exception;
}
