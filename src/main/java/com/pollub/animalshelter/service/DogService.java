package com.pollub.animalshelter.service;

import com.pollub.animalshelter.entity.Dog;
import com.pollub.animalshelter.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DogService {

    private final DogRepository dogRepository;

    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }
}
