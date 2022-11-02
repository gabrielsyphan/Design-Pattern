package com.syphan;

import com.syphan.model.Cat;
import com.syphan.model.Dog;
import com.syphan.model.builder.CatBuilder;
import com.syphan.model.builder.DogBuilder;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Cat tom = new CatBuilder()
            .name("Tom")
            .age(3)
            .color("gray")
            .weight(5.5f)
            .height(0.5f)
            .build();

        Dog simas = new DogBuilder()
            .name("Simas")
            .age(2)
            .color("white")
            .weight(10.5f)
            .height(0.7f)
            .build();

        tom.makeSound();
        simas.makeSound();

        String food = JOptionPane.showInputDialog("What food do you want to feed the animals?");
        if(food != null) {
            tom.eat(food);
            simas.eat(food);
        }

        String place = JOptionPane.showInputDialog("Where do you want to go?");
        if(place != null) {
            tom.move(place);
            simas.move(place);
        }
    }
}