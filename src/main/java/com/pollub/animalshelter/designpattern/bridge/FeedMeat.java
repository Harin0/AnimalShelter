package com.pollub.animalshelter.designpattern.bridge;

//Tydzień 2, Wzorzec Bridge
public class FeedMeat implements FeedBehavior {
    @Override
    public void feed() {
        System.out.println("Feeding the animal with meat.");
    }
}
//Koniec, Tydzień 2, Wzorzec Bridge
