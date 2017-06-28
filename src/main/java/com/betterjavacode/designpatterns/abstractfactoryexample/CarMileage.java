package com.betterjavacode.designpatterns.abstractfactoryexample;

/**
 * 
 * @author Yogesh Mali
 *
 */
public abstract class CarMileage {

    protected double distance;
    protected double gas;

    public abstract void getCarMileage(double dist, double gasfilled);

    public void calculateCarMileage(double dist, double gasfilled) {
        double carmileage = dist / gasfilled;
        System.out.println(" Your car mileage is " + carmileage);
    }
}
