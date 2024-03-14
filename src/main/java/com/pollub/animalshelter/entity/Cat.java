package com.pollub.animalshelter.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cat extends Animal {
    private String color;
}
