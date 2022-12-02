package com.syphan.controller;

import com.syphan.model.User;

import java.util.List;

public class UserExistsMiddleware extends Middleware {

    private final List<User> users = List.of(
            new User("admin@admin.com", "adminPassword"),
            new User("gabriel@syphan.com", "syphanPassword"),
            new User("user@user.com", "userPassword"),
            new User("test@test.com", "testPassword")
    );

    @Override
    public boolean check(User user) {
        if(users.stream().anyMatch(u -> u.getEmail().equals(user.getEmail()))) {
            System.out.println("User exists in database.");
            return checkNext(user);
        }

        System.out.println("User does not exist in database.");
        return false;
    }
}
