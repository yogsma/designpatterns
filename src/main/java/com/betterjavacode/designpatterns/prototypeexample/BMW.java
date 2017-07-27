package com.betterjavacode.designpatterns.prototypeexample;

public class BMW implements Car {

    private final String CARNAME = "BMW";

    public Car clone() {
        return new BMW();
    }

    @Override
    public String toString() {
        return CARNAME;
    }

}
