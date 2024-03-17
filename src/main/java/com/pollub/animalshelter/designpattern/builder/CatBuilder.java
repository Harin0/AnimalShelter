package com.pollub.animalshelter.designpattern.builder;

import com.pollub.animalshelter.entity.Cat;

//Tydzień 1, Wzorzec Builder
public class CatBuilder extends AnimalBuilder<CatBuilder> {
    private String color;

    public CatBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Cat build() {
        Cat cat = new Cat();
        cat.setName(name);
        cat.setGender(gender);
        cat.setAge(age);
        cat.setDescription(description);
        cat.setArrivalDate(arrivalDate);
        cat.setColor(color);
        cat.setHeightInMeters(heightInMeters);
        return cat;
    }
}
//Koniec, Tydzień 1, Wzorzec Builder

