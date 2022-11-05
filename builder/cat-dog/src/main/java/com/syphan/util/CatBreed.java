package com.syphan.util;

public enum CatBreed {

    RAGDOLL(1, "Ragdoll"),
    EXOTIC_SHORTHAIR(2, "Exotic Shorthair"),
    MAINE_COON(3, "Maine Coon"),
    PERSIAN(4, "Persian"),
    AMERICAN_SHORTHAIR(5, "American Shorthair"),
    BRITISH_SHORHAIR(6, "British Shorthair"),
    SIAMESE(7, "Siamese"),
    DEVON_REX(8, "Devon Rex"),
    ABYSSINIAN(9, "Abyssinian"),
    SCOTTISH_FOLD(10, "Scottish Fold"),
    SPHYNX(11, "Sphynx"),
    BENGAL(12, "Bengal");

    private final int value;
    private final String name;

    CatBreed(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static CatBreed getByValue(int value) {
        for(CatBreed breed : values()) {
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
