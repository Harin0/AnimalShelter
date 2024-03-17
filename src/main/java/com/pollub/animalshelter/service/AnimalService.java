package com.pollub.animalshelter.service;

import com.pollub.animalshelter.entity.Animal;
import com.pollub.animalshelter.repository.CatRepository;
import com.pollub.animalshelter.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {
    private final CatRepository catRepository;
    private final DogRepository dogRepository;


    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.addAll(catRepository.findAll());
        animals.addAll(dogRepository.findAll());
        return animals;
    }
}
