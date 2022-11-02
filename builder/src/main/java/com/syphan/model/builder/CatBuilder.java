package com.syphan.model.builder;

import com.syphan.model.Cat;

public class CatBuilder {

    private final Cat obj;

    public CatBuilder() {
        this.obj = new Cat();
    }

    public CatBuilder name(String name) {
        this.obj.setName(name);
        return this;
    }

    public CatBuilder age(int age) {
        this.obj.setAge(age);
        return this;
    }

    public CatBuilder color(String color) {
        this.obj.setColor(color);
        return this;
    }

    public CatBuilder weight(float weight) {
        this.obj.setWeight(weight);
        return this;
    }

    public CatBuilder height(float height) {
        this.obj.setHeight(height);
        return this;
    }

    public Cat build() {
        return this.obj;
    }
}
