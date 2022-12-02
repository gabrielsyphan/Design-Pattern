package com.syphan.controller;

import com.syphan.model.User;

public class InvalidPasswordMiddlaware extends Middleware {

    @Override
    public boolean check(User user) {
        if(user.getPassword().length() < 6) {
            System.out.println("Password is too short.");
            return false;
        }

        System.out.println("Password is valid.");
        return checkNext(user);
    }
}
