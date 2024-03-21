package com.pollub.animalshelter.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

//Tydzień 3, Wzorzec Flyweight
public class FlyBoxEquipment implements AbstractFlyBoxEquipment{
    private Map<String, String> equipment;
    private String bowlType;
    private String blanketMaterial;
    private String lockType;
    FlyBoxEquipment(String bowlType, String blanketMaterial, String lockType){
        this.bowlType = bowlType;
        this.blanketMaterial = blanketMaterial;
        this.lockType = lockType;
    }
    @Override
    public Map<String, String> getEquipment() {
        equipment = new HashMap<String, String>();
        equipment.put("Type of feeding bowl: ", bowlType);
        equipment.put("Blanket material: ", blanketMaterial);
        equipment.put("Type of lock: ", lockType);
        return equipment;
    }
}
//Koniec, Tydzień 3, Wzorzec Flyweight
