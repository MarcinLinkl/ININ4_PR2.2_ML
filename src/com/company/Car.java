package com.company;

public class Car {
    final String model;
    final String producer;
    final int horsepower;
    final float engineCapacity;
    final int yearOfProduction;
    int value;

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
