package com.codecool.car_race.Controller;

import com.codecool.car_race.Main;
import com.codecool.car_race.Model.Car;
import com.codecool.car_race.Model.Motorcycle;
import com.codecool.car_race.Model.Truck;
import com.codecool.car_race.Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehiclesController {
    RaceController raceController;
    List<Vehicle> vehicles = new ArrayList();

    public VehiclesController(RaceController raceController){
        this.raceController = raceController;
        createVehicles();
    }
    /**
     * Creates all the vehicles that will be part of this race.
     */
    public void createVehicles() {
        createCars();
        createMotorcycle();
        createTruck();
        raceController.setVehicles(vehicles);
    }

    private void createCars(){
        List<String> CarFirstName = new ArrayList<String>(Arrays.asList("Expedition", "Hollo", "Enigma", "Shadow", "Prospect", "Thriller", "Aura", "Dragon", "Serpent", "Adventure"));
        List<String> CarSecondName = new ArrayList<String>(Arrays.asList("Dragon", "Patron", "Prodigy", "Ranger", "Olympian", "Formula", "Vagabond", "Eagle", "Hero", "Legend"));
        for(int i=10; i>0; i--){
            int firstRandomNumber = (int)(Math.random() * i );
            int secondRandomNumber = (int)(Math.random() * i );
            String name = CarFirstName.get(firstRandomNumber) + " " + CarSecondName.get(secondRandomNumber);
            CarFirstName.remove(firstRandomNumber);
            CarSecondName.remove(secondRandomNumber);

            Car car = new Car(raceController, name);
            vehicles.add(car);

        }
    }
    private void createMotorcycle(){
        for(int i=1; i<=10; i++){
            Motorcycle motorcycle = new Motorcycle(raceController, i);
            vehicles.add(motorcycle);
        }
    }
    private void createTruck(){
        List<Integer> randomNumbers = new ArrayList<>();
        for(int i=0; i<10; i++){
            int random = (int)(Math.random() * 1001 );
            while(Arrays.asList(randomNumbers).contains(random)){
                random = (int)(Math.random() * 1001 );
            }
            String name = String.valueOf(random);
            Truck truck = new Truck(raceController, name);
            vehicles.add(truck);
        }

    }
}
