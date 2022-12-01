package com.syphan.dao;

import java.util.List;

public interface Crud <T>{

    public T findById(long id);

    public List<T> findAll();

    public void deleteById(long id);

    public void deleteAll();

    public T save(T obj);

    public T update(T obj);
}
