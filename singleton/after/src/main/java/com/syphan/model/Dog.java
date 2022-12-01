package com.syphan.model;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        this.logger.info(this.getName() + " - Woof");
    }
}