package com.betterjavacode.designpatterns;

import com.betterjavacode.designpatterns.adapterexample.AsiaSocket;
import com.betterjavacode.designpatterns.adapterexample.EuropeAsiaAdapter;
import com.betterjavacode.designpatterns.adapterexample.EuropeSocket;
import com.betterjavacode.designpatterns.adapterexample.IEuropeSocket;

public class AdapterDemo {

    public static void main(String[] args) {
        EuropeSocket es = new EuropeSocket();

        AsiaSocket as = new AsiaSocket();

        IEuropeSocket europeAsiaAdapter = new EuropeAsiaAdapter(as);

        System.out.println(" Electricity in Asia ");
        as.provideElectricity();

        System.out.println(" Electricity in Europe ");
        es.getElectricity();

        System.out.println(" Electricity for Asia in Europe");
        europeAsiaAdapter.getElectricity();

    }

}
