package com.pollub.animalshelter.designpattern.composite;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//Tydzień 2, Wzorzec Composite
@Component
@Getter
@Setter
@NoArgsConstructor
public class AnimalGroup implements AnimalComponent {
    private List<AnimalComponent> components = new ArrayList<>();

    public void add(AnimalComponent component) {
        components.add(component);
    }

    public void remove(AnimalComponent component) {
        components.remove(component);
    }

    @Override
    public void feed() {
        for (AnimalComponent component : components) {
            component.feed();
        }
    }
}
//Koniec, Tydzień 2, Wzorzec Composite
