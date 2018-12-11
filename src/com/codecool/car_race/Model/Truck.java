package com.codecool.car_race.Model;

import com.codecool.car_race.Controller.RaceController;

public class Truck extends  Vehicle {
    public Truck(RaceController raceController, String name){
        super(raceController);
        normalSpeed = 100;
        this.name = name;
    }
}
