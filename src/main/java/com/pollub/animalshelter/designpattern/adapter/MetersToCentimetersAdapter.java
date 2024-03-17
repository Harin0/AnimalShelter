package com.pollub.animalshelter.designpattern.adapter;

//Tydzień 2, Wzorzec Addapter
public class MetersToCentimetersAdapter implements HeightAdapter {
    @Override
    public double convert(double heightInMeters) {
        return heightInMeters * 100;
    }
}
//Koniec, Tydzień 2, Wzorzec Adapter
