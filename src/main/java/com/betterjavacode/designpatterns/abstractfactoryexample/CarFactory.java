package com.betterjavacode.designpatterns.abstractfactoryexample;

/**
 * 
 * @author Yogesh Mali
 *
 */
public class CarFactory extends AbstractFactory {

    @Override
    public CarMileage getCarMileage(String car) {

        if (car == null || car.equals("")) {
            return null;
        }
        if (car.equalsIgnoreCase("camry")) {
            return new CamryCarMileage();
        } else if (car.equalsIgnoreCase("corolla")) {
            return new CorollaCarMileage();
        } else if (car.equalsIgnoreCase("avalanche")) {
            return new AvalanceCarMileage();
        }
        return null;
    }

}
