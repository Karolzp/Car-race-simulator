package com.codecool.car_race.View;

import com.codecool.car_race.Model.Vehicle;

import java.util.List;

public class RaceView {

//    public void printRaceResults(List<Vehicle> vehicles){
//        for (Vehicle vehicle : vehicles) {
//            System.out.print(vehicle.getName() + " ");
//            System.out.println(vehicle.getDistanceTraveled());
//        }
//    }

    public void printRaceResults(List<Vehicle> vehicles){
        for (int i =0; i < vehicles.size(); i++) {
            System.out.print(vehicles.get(i).getName() + " ");
            System.out.println(vehicles.get(i).getDistanceTraveled());
        }
    }
}
