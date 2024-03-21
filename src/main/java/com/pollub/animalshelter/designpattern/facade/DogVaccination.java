package com.pollub.animalshelter.designpattern.facade;

//Tydzień 3, Wzorzec Facade
public class DogVaccination implements Vaccination{
    private void vaccinateAgainstKennelCough(){
        System.out.println("Vaccinating dog against kennel cough");
    }

    private void vaccinateAgainstRabies(){
        System.out.println("Vaccinating dog against rabies");
    }

    private void vaccinateAgainstInfectiousHepatitis(){
        System.out.println("Vaccinating dog against infectious hepatitis");
    }
    @Override
    public void prepareNeedle() {
        System.out.println("Thick needle for a dog");
    }

    @Override
    public void sanitizeVaccinationPoint() {
        shaveFur();
    }

    private void shaveFur() {
        System.out.println("Shaving fur with a big razor");
    }

    @Override
    public void dressVaccinationPointWound() {
        System.out.println("Wrapping the wound with big blue bandage");
    }

    @Override
    public void vaccinate(String vaccinationType) {
        switch(vaccinationType) {
            case "rabies":
                vaccinateAgainstRabies();
                break;
            case "cough":
                vaccinateAgainstKennelCough();
                break;
            case "hepatitis":
                vaccinateAgainstInfectiousHepatitis();
                break;
        }
    }
}
//Koniec, Tydzień 3, Wzorzec Facade
