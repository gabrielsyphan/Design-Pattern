package com.syphan.dao;

import com.syphan.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogDao implements Crud<Dog> {

    private static DogDao instance;
    private final List<Dog> dogs = new ArrayList<Dog>();

    private DogDao() { }

    public static DogDao getInstance() {
        if(instance == null) {
            instance = new DogDao();
        }

        return instance;
    }

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
