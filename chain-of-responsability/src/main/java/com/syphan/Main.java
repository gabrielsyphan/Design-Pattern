package com.syphan;

import com.syphan.controller.*;
import com.syphan.model.User;

public class Main {
    public static void main(String[] args) {

        Middleware middleware = Middleware.link(
                new InvalidPasswordMiddlaware(),
                new RoleCheckMiddleware(),
                new UserExistsMiddleware()
        );

        Server server = new Server(middleware);

        // Password is too short
        server.logIn(new User("admin", "admin"));

        // User does not exist in database
        server.logIn(new User("user@user.com", "userPassword"));
    }
}