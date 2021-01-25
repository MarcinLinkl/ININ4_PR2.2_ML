package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public abstract class Device implements Saleable, Comparable<Device> {
    final public String model;
    final public String producer;
    final public int yearOfProduction;
    public Double value;

    public Device(String model, String producer, int yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    abstract void turnOn();

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }

    public Double getValue() {
        return this.value;
    }

    public int compareTo(Device o) {
        return this.yearOfProduction - o.yearOfProduction;
    }

}
