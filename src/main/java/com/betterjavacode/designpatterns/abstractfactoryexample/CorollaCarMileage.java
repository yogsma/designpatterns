package com.betterjavacode.designpatterns.abstractfactoryexample;

/**
 * 
 * @author Yogesh Mali
 *
 */
public class CorollaCarMileage extends CarMileage {

    @Override
    public void getCarMileage(double dist, double gasfilled) {

        distance = dist;
        gas = gasfilled;
        calculateCarMileage(distance, gas);
    }

}
