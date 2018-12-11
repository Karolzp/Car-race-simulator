package com.codecool.car_race.Model;

import com.codecool.car_race.Controller.RaceController;

import java.util.Random;

public abstract class Vehicle {
//    protected Random rand = new Random();
    protected RaceController raceController;
    protected String name;
    protected int normalSpeed;
    protected int actualSpeed;
    protected int distanceTraveled = 0;

    public  Vehicle(RaceController raceController){
        this.raceController = raceController;
        actualSpeed = normalSpeed;
    }

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void prepareForLap(){

    }

    public void moveForAnHour(){
        distanceTraveled += actualSpeed;
    }
}
