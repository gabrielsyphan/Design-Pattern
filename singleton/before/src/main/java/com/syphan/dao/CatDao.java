package com.syphan.dao;

import com.syphan.model.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatDao implements Crud<Cat> {
    private final List<Cat> cats = new ArrayList<Cat>();

    @Override
    public Cat findById(long id) {
        return null;
    }

    @Override
    public List<Cat> findAll() {
        return this.cats;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Cat save(Cat obj) {
        this.cats.add(obj);
        return obj;
    }

    @Override
    public Cat update(Cat obj) {
        return null;
    }
}
