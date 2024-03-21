package com.pollub.animalshelter.designpattern.facade;

import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.entity.Cat;
import com.pollub.animalshelter.entity.Dog;

//Tydzień 3, Wzorzec Facade
public class VaccinationFacade {
    public static void vaccinateAnimal(Animal animal, Boolean optionalVaccinations){
        if(animal instanceof Dog){
            vaccinateDog(optionalVaccinations);
        } else if(animal instanceof Cat){
            vaccinateCat(optionalVaccinations);
        }
    }

    private static void vaccinateCatWithOptional(CatVaccination catVaccination){
        catVaccination.vaccinate("enteritis");
    }

    private static void vaccinateCatWithRequired(CatVaccination catVaccination){
        catVaccination.vaccinate("flu");
        catVaccination.vaccinate("leukaemia");
    }

    private static void vaccinateCat(Boolean optionalVaccinations){
        CatVaccination catVaccination = new CatVaccination();
        catVaccination.holdCat();
        catVaccination.shaveFur();
        catVaccination.sanitizeVaccinationPoint();
        catVaccination.prepareNeedle();

        vaccinateCatWithRequired(catVaccination);
        if(optionalVaccinations){
            vaccinateCatWithOptional(catVaccination);
        }
        catVaccination.dressVaccinationPointWound();
    }

    private static void vaccinateDogWithOptional(DogVaccination dogVaccination){
        dogVaccination.vaccinate("rabies");
    }

    private static void vaccinateDogWithRequired(DogVaccination dogVaccination){
        dogVaccination.vaccinate("cough");
        dogVaccination.vaccinate("hepatitis");
    }

    private static void vaccinateDog(Boolean optionalVaccinations){
        DogVaccination dogVaccination = new DogVaccination();
        dogVaccination.sanitizeVaccinationPoint();
        dogVaccination.prepareNeedle();

        vaccinateDogWithRequired(dogVaccination);
        if(optionalVaccinations){
            vaccinateDogWithOptional(dogVaccination);
        }
        dogVaccination.dressVaccinationPointWound();
    }
}
//Koniec, Tydzień 3, Wzorzec Facade
