package com.codecool.car_race.Controller;

import com.codecool.car_race.Model.Vehicle;
import com.codecool.car_race.Model.Weather;
import com.codecool.car_race.View.RaceView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RaceController {
    private int brokenTrucks = 0;
    private boolean thereIsABrokenTruck = false;
    private List<Vehicle> vehicles = new ArrayList();
    private Weather weather;
    private RaceView raceView;
    private List<Vehicle> winners = new ArrayList();

    public RaceController(){
        this.raceView = new RaceView();
        this.weather = new Weather();
    }

    public Weather getWeather() {
        return weather;
    }

    public RaceView getRaceView() {
        return raceView;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Vehicle> getWinners() {
        return winners;
    }

    public void addBrokenTruck() {
        this.brokenTrucks += 1;
        this.thereIsABrokenTruck = true;
    }

    public void deleteBrokenTruck(){
        this.brokenTrucks -= 1;
        if(brokenTrucks == 0){
            this.thereIsABrokenTruck = false;
        }
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
        calculateWinners();
    }

    public void moveEachVehicleForAnHour(){
        for (Vehicle vehicle: vehicles) {
            vehicle.prepareForLap();
            vehicle.moveForAnHour();
        }
    }

    public void calculateWinners(){
        winners.add(vehicles.get(0));
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getDistanceTraveled() > winners.get(0).getDistanceTraveled()){
                winners.clear();
                winners.add(vehicle);
            } else if (vehicle.getDistanceTraveled() == winners.get(0).getDistanceTraveled()){
                winners.add(vehicle);
            }
        }
//        int highestDistance = Collections.max()
    }

}
