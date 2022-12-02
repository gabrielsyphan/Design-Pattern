package com.syphan.controller;

import com.syphan.model.User;

public class Server {

    private Middleware middleware;

    public Server(Middleware middleware) {
        this.middleware = middleware;
    }

    public void logIn(User user) {
        if (this.middleware.check(user)) {
            System.out.println("Server: Authorization has been successful!");
        } else {
            System.out.println("Server: Authorization has been failed!");
        }
    }
}
