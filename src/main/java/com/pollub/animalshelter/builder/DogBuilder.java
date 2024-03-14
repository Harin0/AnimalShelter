package com.pollub.animalshelter.builder;

import com.pollub.animalshelter.entity.Dog;

//Tydzień 1, Wzorzec Builder
public class DogBuilder extends AnimalBuilder<DogBuilder> {
    private String breed;
    private String size;

    public DogBuilder breed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBuilder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public Dog build() {
        Dog dog = new Dog();
        dog.setName(name);
        dog.setGender(gender);
        dog.setAge(age);
        dog.setDescription(description);
        dog.setArrivalDate(arrivalDate);
        dog.setBreed(breed);
        dog.setSize(size);
        return dog;
    }
}
//Koniec, Tydzień 1, Wzorzec Builder
