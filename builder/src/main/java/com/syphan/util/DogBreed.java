package com.syphan.util;

public enum DogBreed {

    GOLDEN_RETRIEVER(1, "Golden Retriever"),
    LABRADOR_RETRIEVER(2, "Labrador Retriever"),
    FRENCH_BULLDOG(3, "French Bulldog"),
    BEAGLE(4, "Beagle"),
    GERMAN_SHEPHERD_DOG(5, "German Shepherd Dog"),
    POODLE(6, "Poodle"),
    BULLDOG(7, "Bulldog");

    private final int value;
    private final String name;

    DogBreed(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static DogBreed getByValue(int value) {
        for(DogBreed breed : values()) {
            if(breed.getValue() == value) {
                return breed;
            }
        }

        return null;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}
