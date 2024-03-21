package com.pollub.animalshelter.designpattern.flyweight;

import java.util.HashMap;

//Tydzień 3, Wzorzec Flyweight
public class FlyBoxEquipmentFactory {
    private static final HashMap<String, FlyBoxEquipment>
            equipmentSet = new HashMap<String, FlyBoxEquipment>();

    public static FlyBoxEquipment getEquipment(String equipmentType) {
        FlyBoxEquipment equipmentImplementation = equipmentSet.get(equipmentType);
        if(equipmentImplementation == null) {
            if(equipmentType.equals("durable")) {
                equipmentImplementation = new FlyBoxEquipment("stainless steel", "wool", "padlock");
            } else if(equipmentType.equals("cheap")){
                equipmentImplementation = new FlyBoxEquipment("plastic", "poliester", "electric");
            }
            equipmentSet.put(equipmentType, equipmentImplementation);
        }
        return equipmentImplementation;
    }
}
//Koniec, Tydzień 3, Wzorzec Flyweight
