package com.betterjavacode.designpatterns;

import com.betterjavacode.designpatterns.prototypeexample.Car;
import com.betterjavacode.designpatterns.prototypeexample.CarFactory;

public class PrototypeDemo {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String type : args) {
                Car prototype = CarFactory.getPrototype(type);
                if (prototype != null) {
                    System.out.println(prototype);
                }
            }
        } else {
            System.out.println(" Run again with arguments");
        }

    }

}
