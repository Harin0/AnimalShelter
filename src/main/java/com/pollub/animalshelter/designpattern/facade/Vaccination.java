package com.pollub.animalshelter.designpattern.facade;

public interface Vaccination {
    void prepareNeedle();
    void sanitizeVaccinationPoint();
    void dressVaccinationPointWound();
    void vaccinate(String vaccinationType);
}
