package com.codecool.car_race.Model;

import com.codecool.car_race.Controller.RaceController;

public class Truck extends  Vehicle {
    private int breakdownTurnsLeft = 0;

    public Truck(RaceController raceController, String name){
        super(raceController);
        normalSpeed = 100;
        this.name = name;
    }

    @Override
    public void prepareForLap(){
        if(breakdownTurnsLeft == 0){
            raceController.deleteBrokenTruck();
            if ((int) (Math.random() * 101) < 5){
                actualSpeed = 0;
                breakdownTurnsLeft = 2;
                raceController.addBrokenTruck();
            } else {
                actualSpeed = normalSpeed;
            }
        } else {
            breakdownTurnsLeft -= 1;
        }
    }
}
