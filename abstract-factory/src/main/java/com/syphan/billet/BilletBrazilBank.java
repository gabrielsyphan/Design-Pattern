package com.syphan.billet;

import com.syphan.invoice.Invoice;
import com.syphan.invoice.InvoiceAbstract;

import java.security.SecureRandom;

public class BilletBrazilBank implements Billet {
    private long billetCode;
    private InvoiceAbstract invoice;

    public BilletBrazilBank() {
        SecureRandom secureRandom = new SecureRandom();
        this.billetCode = secureRandom.nextInt();
    }

    public long getBilletCode() {
        return billetCode;
    }

    public void setBilletCode(long billetCode) {
        this.billetCode = billetCode;
    }

    public InvoiceAbstract getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceAbstract invoice) {
        this.invoice = invoice;
    }

    @Override
    public void emit(Invoice invoice) {
        this.invoice = (InvoiceAbstract) invoice;
        this.invoice.getProductList().forEach(product -> {
            System.out.println(product.getName() + " - " + product.getTaxValue());
        });
    }
}
