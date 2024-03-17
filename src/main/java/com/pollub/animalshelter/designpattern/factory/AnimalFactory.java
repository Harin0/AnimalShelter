package com.pollub.animalshelter.designpattern.factory;

import com.pollub.animalshelter.designpattern.builder.CatBuilder;
import com.pollub.animalshelter.designpattern.builder.DogBuilder;
import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.exception.CloningException;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AnimalFactory {

    //Tydzień 1, Wzorzec Singleton
    private static AnimalFactory instance;

    private AnimalFactory() {
    }

    public static synchronized AnimalFactory getInstance() {
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    //Koniec, Tydzień 1, Wzorzec Singleton

    //Tydzień 1, Wzorzec Factory

    public Animal createAnimal(String type,
                               String name,
                               String gender,
                               String age,
                               String description,
                               Date arrivalDate,
                               String color,
                               String breed,
                               String size,
                               double heightInMeters) {
        return switch (type.toLowerCase()) {
            case "cat" -> new CatBuilder()
                    .name(name)
                    .gender(gender)
                    .age(age)
                    .description(description)
                    .arrivalDate(arrivalDate)
                    .color(color)
                    .heightInMeters(heightInMeters)
                    .build();
            case "dog" -> new DogBuilder()
                    .name(name)
                    .gender(gender)
                    .age(age)
                    .description(description)
                    .arrivalDate(arrivalDate)
                    .breed(breed)
                    .size(size)
                    .heightInMeters(heightInMeters)
                    .build();
            default -> throw new IllegalArgumentException("Invalid animal type: " + type);
        };
    }
    //Koniec, Tydzień 1, Wzorzec Factory

    //Tydzień 1, Wzorzec Prototype

    public Animal cloneAnimal(Animal animal) {
        try {
            return (Animal) animal.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloningException("Failed to clone animal", e);
        }
    }
    //Koniec, Tydzień 1, Wzorzec Prototype
}
