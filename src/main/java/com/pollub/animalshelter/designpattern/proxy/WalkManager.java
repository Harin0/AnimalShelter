package com.pollub.animalshelter.designpattern.proxy;

import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.entity.Person;

//Tydzień 3, Wzorzec Proxy
public interface WalkManager {
    public void walk(Animal animal, Person person);
    public boolean canWalk(Animal animal, Person person);
}
//Koniec, Tydzień 3, Wzorzec Proxy
