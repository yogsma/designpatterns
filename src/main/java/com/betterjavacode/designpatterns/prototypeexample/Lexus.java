package com.betterjavacode.designpatterns.prototypeexample;

public class Lexus implements Car {

    private final String CARNAME = "LEXUS";

    public Car clone() {
        return new Lexus();
    }

    @Override
    public String toString() {
        return CARNAME;
    }

}
