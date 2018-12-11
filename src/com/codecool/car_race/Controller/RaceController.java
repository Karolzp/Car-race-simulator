package com.codecool.car_race.Controller;

import com.codecool.car_race.Model.Vehicle;
import com.codecool.car_race.Model.Weather;
import com.codecool.car_race.View.RaceView;

import java.util.ArrayList;
import java.util.List;

public class RaceController {
    private boolean thereIsABrokenTruck = false;
    private List<Vehicle> vehicles = new ArrayList();
    private Weather weather;
    private RaceView raceView;

    public RaceController(){
        this.raceView = new RaceView();
        this.weather = new Weather();
    }

    public RaceView getRaceView() {
        return raceView;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public boolean isThereABrokenTruck() {
        return thereIsABrokenTruck;
    }

    public void simulateRace() {
        for(int i=0; i < 50; i++) {
            weather.setRaining();
            moveEachVehicleForAnHour();
        }
    }

    public void moveEachVehicleForAnHour(){
        for (Vehicle vehicle: vehicles) {
            vehicle.prepareForLap();
            vehicle.moveForAnHour();
        }
    }


}
