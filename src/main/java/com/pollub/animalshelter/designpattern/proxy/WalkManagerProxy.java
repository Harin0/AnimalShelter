package com.pollub.animalshelter.designpattern.proxy;

import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.entity.Person;

//Tydzień 3, Wzorzec Proxy
public class WalkManagerProxy implements WalkManager{
    private WalkManagerImplementation walkManager;

    public WalkManagerProxy(){
        walkManager = new WalkManagerImplementation();
    }
    @Override
    public void walk(Animal animal, Person person) {
        if(person.isRegistered() && canWalk(animal, person)){
            walkManager.walk(animal, person);
        } else {
            System.out.println(person.getName() + " can not walk " + animal.getName());
        }
    }

    @Override
    public boolean canWalk(Animal animal, Person person) {
        return walkManager.canWalk(animal, person);
    }
}
//Koniec, Tydzień 3, Wzorzec Proxy