package com.pollub.animalshelter.service;

import com.pollub.animalshelter.entity.Cat;
import com.pollub.animalshelter.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }
}
