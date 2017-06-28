package com.betterjavacode.designpatterns.abstractfactoryexample;

/**
 * 
 * @author Yogesh Mali
 *
 */
public class FactoryCreator {

    public static AbstractFactory getFactory() {
        return new CarFactory();
    }
}
