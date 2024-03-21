package com.pollub.animalshelter.designpattern.flyweight;

import java.util.Map;
import java.util.stream.Collectors;

//Tydzień 3, Wzorzec Flyweight
public class Box {
    private final double BOX_AREA;
    private final double BOX_HEIGHT;
    private FlyBoxEquipment boxEquipment;
    public Box(double boxArea, double boxHeight){
        this.BOX_AREA = boxArea;
        this.BOX_HEIGHT = boxHeight;
    }

    public void setBoxEquipment(FlyBoxEquipment boxEquipment){
        this.boxEquipment = boxEquipment;
    }

    public String showBox() {
        return BOX_AREA+"m^2 x " + BOX_HEIGHT;
    }

    @Override
    public String toString(){
        Map<String, String> map = boxEquipment.getEquipment();
        String mapAsString = map.keySet().stream().map(key -> key + map.get(key)).collect(Collectors.joining(", ", "{", "}"));
        return showBox()+"\n"+mapAsString;
    }
}
//Koniec, Tydzień 3, Wzorzec Flyweight
