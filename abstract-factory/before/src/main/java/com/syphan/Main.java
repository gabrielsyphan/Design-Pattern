package com.syphan;

import com.syphan.model.billet.Billet;
import com.syphan.model.billet.C6Billet;
import com.syphan.model.billet.NubankBillet;
import com.syphan.model.invoice.AlagoasInvoice;
import com.syphan.model.invoice.Invoice;
import com.syphan.model.invoice.RecifeInvoice;
import com.syphan.model.order.Order;
import com.syphan.model.product.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Dell G5", "Notebook", "7200");
        Product product2 = new Product("Dell G3", "Notebook", "3500");
        List<Product> products = List.of(product1, product2);

        Billet billet1 = new NubankBillet();
        Invoice invoice1 = new AlagoasInvoice();
        Order order1 = new Order(billet1, invoice1);
        order1.getInvoice().addListProduct(products);
        order1.getInvoice().calculateProductTax();
        order1.getBillet().emit();

        Billet billet2 = new C6Billet();
        Invoice invoice2 = new RecifeInvoice();
        Order order2 = new Order(billet2, invoice2);
        order2.getInvoice().addListProduct(products);
        order2.getInvoice().calculateProductTax();
        order2.getBillet().emit();
    }
}