package com.codecool.car_race.Controller;

public class MainController {
    public MainController(){
        RaceController raceController = new RaceController();
        VehiclesController vehiclesController = new VehiclesController(raceController);
        raceController.simulateRace();
        raceController.getRaceView().printRaceResults(raceController.getVehicles());
        raceController.getRaceView().printWinners(raceController.getWinners());
    }
}
