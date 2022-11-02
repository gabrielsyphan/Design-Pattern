package com.syphan.model;

import java.util.logging.Logger;

public abstract class Animal <T> {

    protected Logger logger = Logger.getLogger(Animal.class.getName());

    private int age;
    private float weight;
    private float height;
    private String name;
    private String color;
    private T breed;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public T getBreed() {
        return breed;
    }

    public void setBreed(T breed) {
        this.breed = breed;
    }

    public abstract void makeSound();

    public void eat(String food) {
        this.logger.info(this.getName() + " - Eating " + food);
    }

    public void sleep() {
        this.logger.info(this.getName() + " - Sleeping");
    }

    public void move(String place) {
        this.logger.info(this.getName() + " - Moving to " + place);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age + '\'' +
                ", color='" + this.color + '\'' +
                ", weight=" + this.weight + '\'' +
                ", height=" + this.height + '\'' +
                '}';
    }
}
