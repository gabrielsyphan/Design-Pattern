package com.syphan.model.Builder;

import com.syphan.model.Invoice;
import com.syphan.model.InvoicePJ;
import com.syphan.model.InvoicePf;
import com.syphan.model.Product;
import com.syphan.util.DateFormatter;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class InvoiceBuilder {

    private Invoice invoice = null;

    public InvoiceBuilder() {}

    public Invoice build() {
        return this.invoice;
    }

    public InvoiceBuilder buildInvoicePf() {
        this.invoice = new InvoicePf();
        return this;
    }

    public InvoiceBuilder buildInvoicePj() {
        this.invoice = new InvoicePJ();
        return this;

    }
    public InvoiceBuilder dateIssued(String dateIssued) throws ParseException {
        Date date = DateFormatter.stringToDate(dateIssued);
        this.invoice.setDateIssued(date);
        return this;
    }

    public InvoiceBuilder codeNumber(long codeNumber) {
        this.invoice.setCodeNumber(codeNumber);
        return this;
    }

    public InvoiceBuilder productList(List<Product> productList) {
        this.invoice.setProductList(productList);
        return this;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }
}
