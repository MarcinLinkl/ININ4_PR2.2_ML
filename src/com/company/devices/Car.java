package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable {

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
        return producer + " " + model + " " + horsepower + "HP " + engineCapacity + "l " + yearOfProduction + " year-of-production";
    }

    @Override
    void turnOn() {
        System.out.println("Car on!");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() < price) {
            throw new Exception("sorry, you have not enough money");
        }
        if (seller.getCar() != this) {
            throw new Exception("Man you don't have a car");
        }
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        buyer.setCar(this);
        seller.setCar(null);
        System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
    }

    public abstract void refuel();
}


