package com.betterjavacode.designpatterns.prototypeexample;

public class Toyota implements Car {

    private final String CARNAME = "Toyota";

    public Car clone() {
        return new Toyota();
    }

    @Override
    public String toString() {
        return CARNAME;
    }

}
