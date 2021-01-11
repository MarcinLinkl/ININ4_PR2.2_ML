package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public abstract class Device implements Saleable {
    final public String model;
    final public String producer;
    final public int yearOfProduction;

    protected Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    abstract void turnOn();

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}
