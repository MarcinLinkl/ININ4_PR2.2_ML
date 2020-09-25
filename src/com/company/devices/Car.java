package com.company.devices;

public class Car {
    final public String model;
    final public String producer;
    final public int horsepower;
    final public float engineCapacity;
    final public int yearOfProduction;
    public int value;

    public Car(String producer, String model, int horsepower, float engineCapacity, int yearOfProduction, int value) {
        this.model = model;
        this.producer = producer;
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public String toString() {
        return producer + " " + model + " " + horsepower + "HP " + engineCapacity + "l " + yearOfProduction+ " year-of-production.";
    }

}
