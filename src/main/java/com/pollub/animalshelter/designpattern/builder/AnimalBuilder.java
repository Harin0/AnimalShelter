package com.pollub.animalshelter.designpattern.builder;

import com.pollub.animalshelter.entity.Animal;

import java.util.Date;

//Tydzień 1, Wzorzec Builder
public abstract class AnimalBuilder<T extends AnimalBuilder<T>> {
    protected String name;
    protected String gender;
    protected String age;
    protected String description;
    protected Date arrivalDate;

    protected double heightInMeters;

    protected boolean isAggressive;

    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    public T gender(String gender) {
        this.gender = gender;
        return (T) this;
    }

    public T age(String age) {
        this.age = age;
        return (T) this;
    }

    public T description(String description) {
        this.description = description;
        return (T) this;
    }

    public T arrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
        return (T) this;
    }

    public T heightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
        return (T) this;
    }

    public T isAggressive(boolean isAggressive) {
        this.isAggressive = isAggressive;
        return (T) this;
    }

    public abstract Animal build();
}
//Koniec, Tydzień 1, Wzorzec Builder


