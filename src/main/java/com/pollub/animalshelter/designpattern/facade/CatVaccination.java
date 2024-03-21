package com.pollub.animalshelter.designpattern.facade;

//Tydzień 3, Wzorzec Facade
public class CatVaccination implements Vaccination{


    private void vaccinateAgainstCatFlu(){
        System.out.println("Vaccinating cat against cat flu");
    }

    private void vaccinateAgainstLeukaemiaVirus(){
        System.out.println("Vaccinating cat against leukaemia virus");
    }

    private void vaccinateAgainstInfectiousEnteritis(){
        System.out.println("Vaccinating cat against infectious enteritis");
    }

    @Override
    public void prepareNeedle() {
        System.out.println("Small needle for a cat");
    }

    @Override
    public void sanitizeVaccinationPoint() {
        sanitize();
    }

    @Override
    public void dressVaccinationPointWound() {
        System.out.println("Wrapping the wound with small purple bandage");
    }

    @Override
    public void vaccinate(String vaccinationType) {
        switch(vaccinationType) {
            case "flu":
                vaccinateAgainstCatFlu();
                break;
            case "leukaemia":
                vaccinateAgainstLeukaemiaVirus();
                break;
            case "enteritis":
                vaccinateAgainstInfectiousEnteritis();
                break;
        }
    }

    public void shaveFur(){
        System.out.println("Shaving with small razor");
    }

    private void sanitize(){
        System.out.println("Applying sanitizing solution");
    }

    public void holdCat(){
        System.out.println("3 people minimum needed to hold the cat so it stays still");
    }
}
//Koniec, Tydzień 3, Wzorzec Facade
