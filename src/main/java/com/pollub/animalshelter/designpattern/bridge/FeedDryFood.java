package com.pollub.animalshelter.designpattern.bridge;

//Tydzień 2, Wzorzec Bridge
public class FeedDryFood implements FeedBehavior {
    @Override
    public void feed() {
        System.out.println("Feeding the animal with dry food.");
    }
}
//Koniec, Tydzień 2, Wzorzec Bridge