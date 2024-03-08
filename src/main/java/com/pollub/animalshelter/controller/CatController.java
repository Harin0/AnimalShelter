package com.pollub.animalshelter.controller;

import com.pollub.animalshelter.entity.Cat;
import com.pollub.animalshelter.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cats")
public class CatController {

    private final CatService catService;

    @GetMapping
    public String getAllCats(Model model) {
        List<Cat> cats = catService.getAllCats();
        model.addAttribute("cats", cats);
        return "cats";
    }
}
