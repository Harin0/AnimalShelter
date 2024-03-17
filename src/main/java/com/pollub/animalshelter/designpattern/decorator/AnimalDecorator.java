package com.pollub.animalshelter.designpattern.decorator;

import com.pollub.animalshelter.entity.Animal;

//Tydzień 2, Wzorzec Decorator

public abstract class AnimalDecorator extends Animal {
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal decoratedAnimal) {
        this.decoratedAnimal = decoratedAnimal;
    }
}

//Koniec, Tydzień 2, Wzorzec Decorator
