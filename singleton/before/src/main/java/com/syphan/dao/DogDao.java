package com.syphan.dao;

import com.syphan.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogDao implements Crud<Dog> {
    private final List<Dog> dogs = new ArrayList<Dog>();

    @Override
    public Dog findById(long id) {
        return null;
    }

    @Override
    public List<Dog> findAll() {
        return this.dogs;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Dog save(Dog obj) {
        this.dogs.add(obj);
        return obj;
    }

    @Override
    public Dog update(Dog obj) {
        return null;
    }
}
