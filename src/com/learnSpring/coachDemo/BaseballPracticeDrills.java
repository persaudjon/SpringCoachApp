package com.learnSpring.coachDemo;

public class BaseballPracticeDrills implements PracticeDrillService {

    private String baseballDrills [] = {"Hitt 100 balls", "Pitch Balls"};
    @Override
    public String getPracticeDrills() {
        return baseballDrills[0];
    }
}

