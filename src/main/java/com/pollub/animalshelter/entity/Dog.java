package com.pollub.animalshelter.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Dog extends Animal {

    private String breed;
    private String size;

    @Override
    public void feed() {
        performFeed();
    }
}
