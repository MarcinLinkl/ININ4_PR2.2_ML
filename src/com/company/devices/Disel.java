package com.company.devices;

public class Disel extends Car{
    public Disel(String producer, String model, int horsepower, float engineCapacity, int yearOfProduction, int value) {
        super(producer, model, horsepower, engineCapacity, yearOfProduction, value);
    }

    @Override
    public void refuel() {

    }
}
