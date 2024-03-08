package com.pollub.animalshelter.runner;

import com.pollub.animalshelter.factory.AnimalFactory;
import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.entity.Cat;
import com.pollub.animalshelter.entity.Dog;
import com.pollub.animalshelter.repository.CatRepository;
import com.pollub.animalshelter.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@RequiredArgsConstructor
@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final CatRepository catRepository;
    private final DogRepository dogRepository;

    AnimalFactory animalFactory = AnimalFactory.getInstance();

    @Override
    public void run(String... args) {

        Date arrivalDate = new Date();

        Animal cat = animalFactory.createAnimal(
                "cat",
                "Whiskers",
                "Female",
                "2",
                "Shy",
                arrivalDate,
                "Black",
                null,
                null);
        Animal dog = animalFactory.createAnimal(
                "dog",
                "Alex",
                "Male",
                "3",
                "Friendly", arrivalDate,
                null,
                "Labrador",
                "Large");

        Animal clonedDog = animalFactory.cloneAnimal(dog);
        Animal clonedCat = animalFactory.cloneAnimal(cat);

        catRepository.save((Cat) cat);
        dogRepository.save((Dog) dog);

        catRepository.save((Cat) clonedCat);
        dogRepository.save((Dog) clonedDog);

        log.info("Database initialized");
    }
}
