package com.pollub.animalshelter.factory;

import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.entity.Cat;
import com.pollub.animalshelter.entity.Dog;
import com.pollub.animalshelter.exception.CloningException;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AnimalFactory {
    private static AnimalFactory instance;

    private AnimalFactory() {
    }

    public static synchronized AnimalFactory getInstance() {
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    public Animal createAnimal(String type,
                               String name,
                               String gender,
                               String age,
                               String description,
                               Date arrivalDate,
                               String color,
                               String breed,
                               String size) {
        return switch (type.toLowerCase()) {
            case "dog" -> Dog.builder()
                    .name(name)
                    .gender(gender)
                    .age(age)
                    .description(description)
                    .arrivalDate(arrivalDate)
                    .breed(breed).size(size)
                    .build();
            case "cat" -> Cat.builder()
                    .name(name)
                    .gender(gender)
                    .age(age)
                    .description(description)
                    .arrivalDate(arrivalDate)
                    .color(color)
                    .build();
            default -> throw new IllegalArgumentException("Invalid animal type: " + type);
        };
    }

    public Animal cloneAnimal(Animal animal) {
        try {
            return (Animal) animal.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloningException("Failed to clone animal", e);
        }
    }
}
