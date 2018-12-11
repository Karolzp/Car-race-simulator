package com.codecool.car_race.Model;

import com.codecool.car_race.Controller.RaceController;

public class Motorcycle extends  Vehicle {
    private int motorcycleNumber;

    public Motorcycle(RaceController raceController, int motorcycleNumber){
        super(raceController);
        normalSpeed = 100;
        this.motorcycleNumber = motorcycleNumber;
        this.name = "Motorcycle " + String.valueOf(motorcycleNumber);
    }
}
