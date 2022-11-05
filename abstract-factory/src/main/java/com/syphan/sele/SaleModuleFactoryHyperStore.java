package com.syphan.sele;

import com.syphan.billet.Billet;
import com.syphan.invoice.Invoice;

import java.io.IOException;
import java.util.Properties;

public class SaleModuleFactoryHyperStore implements SaleModuleFactory{

    private final Properties prop = new Properties();

    public SaleModuleFactoryHyperStore() throws IOException {
        this.prop.load(this.getClass().getResourceAsStream("/config.properties"));
    }

    @Override
    public Billet createBillet() throws Exception {
        String billetClassName = this.prop.getProperty("billet");
        return (Billet) Class.forName(billetClassName).getDeclaredConstructor().newInstance();
    }

    @Override
    public Invoice createInvoice() throws Exception {
        String invoiceClassName = this.prop.getProperty("invoice");
        return (Invoice) Class.forName(invoiceClassName).getDeclaredConstructor().newInstance();
    }
}
