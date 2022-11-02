package com.syphan.model;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        this.logger.info(this.getName() + " - Woof");
    }
}
