package com.company;

public class Car {
    final String model;
    final String producer;
    final int horsepower;
    final float engineCapacity;
    final int yearOfProduction;

    public Car(String producer, String model, int horsepower, float engineCapacity, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
    }


}
