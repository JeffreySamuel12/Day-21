package com.example.demo;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car with " + engine.getType() + " engine is starting.");
    }
}
