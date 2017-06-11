package com.betterjavacode.designpatterns;

public class SingletonDemo {

    private static SingletonDemo demo;

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        if (demo == null)
            demo = new SingletonDemo();

        return demo;
    }

    public void printSingletonDemo() {
        System.out.println(" This is a singleton design pattern demo ");
    }

}
