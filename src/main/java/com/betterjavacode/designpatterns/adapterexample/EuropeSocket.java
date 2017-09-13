package com.betterjavacode.designpatterns.adapterexample;

public class EuropeSocket implements IEuropeSocket {

    public void getElectricity() {
        System.out.println("Get electricity of 120 V");
    }

}
