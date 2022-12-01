package com.syphan.model;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        this.logger.info(this.getName() + " - Meow");
    }
}