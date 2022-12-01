package com.syphan;

import com.syphan.dao.CatDao;
import com.syphan.dao.DogDao;
import com.syphan.model.Cat;
import com.syphan.model.Dog;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        // Instance of all animals
        Cat norman = new Cat("Norman");
        Cat mia = new Cat("Mia");
        Dog oslo = new Dog("Oslo");
        Dog alfred = new Dog("Alfred");

        // Get instance and save each one
        CatDao.getInstance().save(norman);
        CatDao.getInstance().save(mia);
        DogDao.getInstance().save(oslo);
        DogDao.getInstance().save(alfred);

        // Get all animals from database
        List<Cat> cats = CatDao.getInstance().findAll();
        List<Dog> dogs = DogDao.getInstance().findAll();

        // Continuation of implementation...
        cats.forEach(Cat::makeSound);
        dogs.forEach(Dog::makeSound);
    }
}