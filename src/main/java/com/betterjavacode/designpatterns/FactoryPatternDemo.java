package com.betterjavacode.designpatterns;

import com.betterjavacode.designpatterns.factoryexample.Vehicle;
import com.betterjavacode.designpatterns.factoryexample.VehicleFactory;

public class FactoryPatternDemo {

    public static void getSpeed(String vehicleType) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle veh1 = vehicleFactory.getVehicle(vehicleType);

        veh1.speed();
    }

}
