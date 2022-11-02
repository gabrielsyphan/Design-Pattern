package com.syphan.model.builder;

import com.syphan.model.Dog;

public class DogBuilder {

    private final Dog obj;

    public DogBuilder() {
        this.obj = new Dog();
    }

    public DogBuilder name(String name) {
        this.obj.setName(name);
        return this;
    }

    public DogBuilder age(int age) {
        this.obj.setAge(age);
        return this;
    }

    public DogBuilder color(String color) {
        this.obj.setColor(color);
        return this;
    }

    public DogBuilder weight(float weight) {
        this.obj.setWeight(weight);
        return this;
    }

    public DogBuilder height(float height) {
        this.obj.setHeight(height);
        return this;
    }

    public Dog build() {
        return this.obj;
    }
}
