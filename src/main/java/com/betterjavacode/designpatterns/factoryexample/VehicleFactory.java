package com.betterjavacode.designpatterns.factoryexample;

/**
 * 
 * @author Yogesh Mali
 *
 */
public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        }
        if (vehicleType.equalsIgnoreCase("bus")) {
            return new Bus();
        }
        if (vehicleType.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        }
        if (vehicleType.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        return null;
    }
}
