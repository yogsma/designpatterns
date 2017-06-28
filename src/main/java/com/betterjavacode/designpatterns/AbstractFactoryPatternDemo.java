package com.betterjavacode.designpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.betterjavacode.designpatterns.abstractfactoryexample.AbstractFactory;
import com.betterjavacode.designpatterns.abstractfactoryexample.CarMileage;
import com.betterjavacode.designpatterns.abstractfactoryexample.FactoryCreator;

/**
 * 
 * @author Yogesh Mali
 *
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter the car name you want mileage for: ");

        String carname = br.readLine();
        System.out.println("\n");
        System.out.println("Enter the distance covered: ");

        String distanceStr = br.readLine();
        double distance = Double.parseDouble(distanceStr);
        System.out.println("\n");
        System.out.println("Enter the gas you had filled: ");
        System.out.println("\n");
        String gasStr = br.readLine();
        double gas = Double.parseDouble(gasStr);

        AbstractFactory af = FactoryCreator.getFactory();
        CarMileage cm = af.getCarMileage(carname);

        cm.getCarMileage(distance, gas);

    }

}
