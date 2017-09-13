package com.betterjavacode.designpatterns.adapterexample;

public class EuropeAsiaAdapter implements IEuropeSocket {

    AsiaSocket asiaSocket;

    public EuropeAsiaAdapter(AsiaSocket asiaSocket) {
        this.asiaSocket = asiaSocket;
    }

    public void getElectricity() {
        asiaSocket.provideElectricity();
    }

}
