package com.pollub.animalshelter.entity;

import com.pollub.animalshelter.designpattern.bridge.FeedDryFood;
import com.pollub.animalshelter.designpattern.bridge.FeedMeat;
import com.pollub.animalshelter.designpattern.bridge.FeedWetFood;
import com.pollub.animalshelter.designpattern.composite.AnimalComponent;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Animal implements Cloneable, AnimalComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private String age;
    private String description;
    private Date arrivalDate;
    private double heightInMeters;
    private String feedBehavior;
    private Boolean isAggressive = false;

    public void performFeed() {
        if (feedBehavior != null) {
            if (feedBehavior.equals("FeedDryFood")) {
                new FeedDryFood().feed();
            } else if (feedBehavior.equals("FeedWetFood")) {
                new FeedWetFood().feed();
            } else if (feedBehavior.equals("FeedMeat")) {
                new FeedMeat().feed();
            } else {
                throw new IllegalArgumentException("Invalid feed behavior type");
            }
        }else {
            System.out.println("No feeding behavior type specified.");
        }

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
