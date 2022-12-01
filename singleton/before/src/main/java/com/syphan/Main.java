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
        CatDao catDao = new CatDao();
        DogDao dogDao = new DogDao();

        catDao.save(norman);
        catDao.save(mia);
        dogDao.save(oslo);
        dogDao.save(alfred);

        // Get all animals from database
        List<Cat> cats = catDao.findAll();
        List<Dog> dogs = dogDao.findAll();

        // Continuation of implementation...
        cats.forEach(Cat::makeSound);
        dogs.forEach(Dog::makeSound);
    }

    // TODO: Use this method just to show how to use the DAO
    private static void saveCatAndDog(Cat cat, Dog dog, CatDao catDao, DogDao dogDao) throws Exception {
        if (catDao.save(cat) == null) {
            throw new Exception("Failed to save cat: " + cat);
        }

        if (dogDao.save(dog) == null) {
            throw new Exception("Failed to save dog: " + dog);
        }
    }
}