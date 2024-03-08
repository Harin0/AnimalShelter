package com.pollub.animalshelter.controller;

import com.pollub.animalshelter.entity.Dog;
import com.pollub.animalshelter.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/dogs")
public class DogController {

    private final DogService dogService;

    @GetMapping
    public String getAllDogs(Model model) {
        List<Dog> cats = dogService.getAllDogs();
        model.addAttribute("dogs", cats);
        return "dogs";
    }

}