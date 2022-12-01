package com.syphan.controller;

public class EmailListener implements EventListener {

    @Override
    public void onEvent(String event, String message) {
        System.out.println("EmailListener: " + event + " - " + message);
    }
}
