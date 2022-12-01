package com.syphan;

import com.syphan.model.factory.C6OrderFactory;
import com.syphan.model.factory.NubankOrderFactory;
import com.syphan.model.order.Order;
import com.syphan.model.product.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Dell G5", "Notebook", "7200");
        Product product2 = new Product("Dell G3", "Notebook", "3500");
        List<Product> products = List.of(product1, product2);

        Order order = new NubankOrderFactory().createOrder();
        order.getInvoice().addListProduct(products);
        order.getInvoice().calculateProductTax();
        order.getBillet().emit();

        Order order2 = new C6OrderFactory().createOrder();
        order2.getInvoice().addListProduct(products);
        order2.getInvoice().calculateProductTax();
        order2.getBillet().emit();
    }
}