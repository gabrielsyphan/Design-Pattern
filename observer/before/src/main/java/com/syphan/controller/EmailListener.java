package com.syphan.controller;

public class EmailListener {

    public void onEvent(String message) {
        System.out.println("EmailListener: - " + message);
    }
}
