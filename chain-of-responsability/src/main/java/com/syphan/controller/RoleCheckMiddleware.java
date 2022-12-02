package com.syphan.controller;

import com.syphan.model.User;

public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(User user) {
        if(user.getEmail().equals("admin@admin.com")) {
            System.out.println("ADMIN");
        } else {
            System.out.println("USER");
        }
        return checkNext(user);
    }
}
