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
        System.out.println();
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.print(vehicles.get(i).getName() + " traveled ");
            System.out.println(vehicles.get(i).getDistanceTraveled() + "km");
        }
    }

    public  void printWinners(List<Vehicle> vehicles){
        System.out.println();
        System.out.println("The winner is : ");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("  ***> " + vehicles.get(i).getName() + " <***");
        }
    }
}
