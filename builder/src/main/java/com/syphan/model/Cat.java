package com.syphan.model;

import com.syphan.util.CatBreed;

public class Cat extends Animal<CatBreed> {

    @Override
    public void makeSound() {
        this.logger.info(this.getName() + " - Meow");
    }
}
