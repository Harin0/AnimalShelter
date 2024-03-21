package com.pollub.animalshelter.runner;

import com.pollub.animalshelter.designpattern.adapter.HeightAdapter;
import com.pollub.animalshelter.designpattern.adapter.MetersToCentimetersAdapter;
import com.pollub.animalshelter.designpattern.composite.AnimalGroup;
import com.pollub.animalshelter.designpattern.decorator.AdoptedAnimal;
import com.pollub.animalshelter.designpattern.decorator.VaccinatedAnimal;
import com.pollub.animalshelter.designpattern.facade.VaccinationFacade;
import com.pollub.animalshelter.designpattern.factory.AnimalFactory;
import com.pollub.animalshelter.designpattern.flyweight.Box;
import com.pollub.animalshelter.designpattern.flyweight.FlyBoxEquipment;
import com.pollub.animalshelter.designpattern.flyweight.FlyBoxEquipmentFactory;
import com.pollub.animalshelter.designpattern.proxy.WalkManager;
import com.pollub.animalshelter.designpattern.proxy.WalkManagerProxy;
import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.entity.Cat;
import com.pollub.animalshelter.entity.Dog;
import com.pollub.animalshelter.entity.Person;
import com.pollub.animalshelter.repository.CatRepository;
import com.pollub.animalshelter.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final CatRepository catRepository;
    private final DogRepository dogRepository;
    private final WalkManager walkManager = new WalkManagerProxy();
    private final HeightAdapter heightAdapter = new MetersToCentimetersAdapter();

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
                null,
                0.3,
                false
        );

        Animal dog = animalFactory.createAnimal(
                "dog",
                "Alex",
                "Male",
                "3",
                "Friendly",
                arrivalDate,
                null,
                "Labrador",
                "Large",
                0.7,
                true
        );

        Animal clonedDog = animalFactory.cloneAnimal(dog);
        Animal clonedCat = animalFactory.cloneAnimal(cat);

        cat.setFeedBehavior("FeedWetFood");
        dog.setFeedBehavior("FeedDryFood");

        AnimalGroup groupOfCats = new AnimalGroup();
        AnimalGroup groupOfCatsAndDogs = new AnimalGroup();
        AnimalGroup animalGroup = new AnimalGroup();

        groupOfCats.add(cat);
        groupOfCats.add(cat);
        groupOfCatsAndDogs.add(cat);
        groupOfCatsAndDogs.add(dog);

        animalGroup.add(dog);
        animalGroup.remove(dog);
        animalGroup.add(dog);
        animalGroup.add(groupOfCats);
        animalGroup.add(groupOfCatsAndDogs);

        animalGroup.feed();

        catRepository.save((Cat) cat);
        dogRepository.save((Dog) dog);

        catRepository.save((Cat) clonedCat);
        dogRepository.save((Dog) clonedDog);

        cat.setHeightInMeters(heightAdapter.convert(cat.getHeightInMeters()));

        Animal vaccinatedCat = new VaccinatedAnimal(new AdoptedAnimal(cat));
        Animal adoptedDog = new AdoptedAnimal(dog);

        log.info(vaccinatedCat.getDescription());
        log.info(adoptedDog.getDescription());
        log.info("Database initialized");

        //Tydzień 3, Wzorzec Proxy
        Person volunteer = new Person(1L, "Jessica", false, true);
        walkManager.walk(dog, volunteer);
        walkManager.walk(cat, volunteer);
        //Koniec, Tydzień 3, Wzorzec Proxy


        createFlyweightBoxes();
        //Tydzień 3, Wzorzec Facade
        VaccinationFacade.vaccinateAnimal(cat, true);
        VaccinationFacade.vaccinateAnimal(dog, false);
        //Koniec, Tydzień 3, Wzorzec Facade
    }

    //Tydzień 3, Wzorzec Flyweight
    private void createFlyweightBoxes(){
        List<Box> boxes = new ArrayList<>();
        for(int i=0; i<200; i++){
            boxes.add(addEquipmentToBox("durable"));
        }
        for(int i=0; i<200; i++){
            boxes.add(addEquipmentToBox("cheap"));
        }
    }

    private Box addEquipmentToBox(String equipmentType){
        FlyBoxEquipment equipment = FlyBoxEquipmentFactory.getEquipment(equipmentType);
        Double boxArea = Math.random()*20;
        Double boxHeight = Math.random()*4;
        Box box = new Box(boxArea, boxHeight);
        box.setBoxEquipment(equipment);
        System.out.println(box);
        return box;
    }
    //Koniec, Tydzień 3, Wzorzec Flyweight
}
