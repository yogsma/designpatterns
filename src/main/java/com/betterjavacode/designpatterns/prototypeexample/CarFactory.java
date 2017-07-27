package com.betterjavacode.designpatterns.prototypeexample;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    private static final Map<String, Car> prototypes = new HashMap<String, Car>();

    static {
        prototypes.put("toyota", new Toyota());
        prototypes.put("lexus", new Lexus());
        prototypes.put("bmw", new BMW());
    }

    public static Car getPrototype(String type) {
        return prototypes.get(type)
            .clone();
    }
}
