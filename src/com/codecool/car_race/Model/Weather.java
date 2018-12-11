package com.codecool.car_race.Model;

import java.util.Random;

public class Weather {
    private Random rand = new Random();
    private boolean raining;

    public boolean isRaining() {
        return raining;
    }

    public void setRaining() {
        int number = (int) (Math.random() * 101);
        if (number < 30) {
            this.raining = true;
        } else {
            this.raining = false;
        }
    }

}
