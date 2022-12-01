package com.syphan.controller;

public class LogListener  {

    public void onEvent(String message) {
        System.out.println("LogListener: - " + message);
    }
}
