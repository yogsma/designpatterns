package com.betterjavacode.designpatterns;

public class RunDesignPatterns {

    public static void main(String[] args) {

        System.out.println(" Design Pattern lesson 1 ....");
        SingletonDemo.getInstance()
            .printSingletonDemo();

        System.out.println(" Design Pattern lesson 2 ....");
        FactoryPatternDemo.getSpeed("truck");
    }

}
