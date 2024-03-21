package com.pollub.animalshelter.designpattern.proxy;

import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.entity.Person;

//Tydzień 3, Wzorzec Proxy
public class WalkManagerImplementation implements WalkManager{
    @Override
    public void walk(Animal animal, Person person) {
        System.out.println(person.getName() + " walks " + animal.getName());
    }

    @Override
    public boolean canWalk(Animal animal, Person person) {
        if(!animal.getIsAggressive()){
            return true;
        } else {
            return person.isCanManageAggressiveAnimals();
        }
    }
}
//Koniec, Tydzień 3, Wzorzec Proxy