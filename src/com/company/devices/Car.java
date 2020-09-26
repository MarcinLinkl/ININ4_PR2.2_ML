package com.company.devices;

public class Car extends Device {

    final public int horsepower;
    final public float engineCapacity;

    public int value;

    public Car(String producer, String model, int horsepower, float engineCapacity, int yearOfProduction, int value) {
        super(model, producer, yearOfProduction);
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
        this.value = value;
    }

    public String toString() {
        return producer + " " + model + " " + horsepower + "HP " + engineCapacity + "l " + yearOfProduction+ " year-of-production.";
    }

    @Override
    void turnOn() {

    }

}
