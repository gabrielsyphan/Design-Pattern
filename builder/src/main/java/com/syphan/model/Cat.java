package com.syphan.model;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        this.logger.info(this.getName() + " - Meow");
    }
}
