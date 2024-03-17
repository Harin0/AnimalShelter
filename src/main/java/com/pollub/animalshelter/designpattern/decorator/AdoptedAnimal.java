package com.pollub.animalshelter.designpattern.decorator;

import com.pollub.animalshelter.entity.Animal;

//Tydzień 2, Wzorzec Decorator
public class AdoptedAnimal extends AnimalDecorator {
    public AdoptedAnimal(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public String getDescription() {
        return decoratedAnimal.getDescription() + ", adopted";
    }

    @Override
    public void feed() {

    }
}
//Koniec, Tydzień 2, Wzorzec Decorator

