package com.pollub.animalshelter.designpattern.decorator;

import com.pollub.animalshelter.entity.Animal;

//Tydzień 2, Wzorzec Decorator
public class VaccinatedAnimal extends AnimalDecorator {
    public VaccinatedAnimal(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public String getDescription() {
        return decoratedAnimal.getDescription() + ", vaccinated";
    }

    @Override
    public void feed() {

    }
}
//Koniec, Tydzień 2, Wzorzec Decorator
