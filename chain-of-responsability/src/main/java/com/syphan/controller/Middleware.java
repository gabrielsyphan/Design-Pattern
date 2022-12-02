package com.syphan.controller;

import com.syphan.model.User;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... next) {
        Middleware head = first;
        for(Middleware nextMiddleware : next) {
            head.next = nextMiddleware;
            head = nextMiddleware;
        }
        return first;
    }

    public abstract boolean check(User user);

    protected boolean checkNext(User user) {
        return this.next == null || this.next.check(user);
    }
}
