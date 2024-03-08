package com.pollub.animalshelter.entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Dog extends Animal {

    private String breed;
    private String size;
}
