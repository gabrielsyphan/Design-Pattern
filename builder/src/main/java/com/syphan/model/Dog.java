package com.syphan.model;

import com.syphan.util.DogBreed;

public class Dog extends Animal<DogBreed> {

    @Override
    public void makeSound() {
        this.logger.info(this.getName() + " - Woof");
    }
}
