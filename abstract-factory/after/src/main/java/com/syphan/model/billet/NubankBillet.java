package com.syphan.model.billet;

public class NubankBillet implements Billet{


    @Override
    public void emit() {
        System.out.println("Nubank billet emitted");
    }
}
