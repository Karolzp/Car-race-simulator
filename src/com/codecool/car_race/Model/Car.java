package com.codecool.car_race.Model;

import com.codecool.car_race.Controller.RaceController;

public class Car extends  Vehicle {
    public Car(RaceController raceController,String name){
        super(raceController);
        normalSpeed = 80 + (int)(Math.random() * ((110 - 80) + 1));
        this.name = name;
    }
}
