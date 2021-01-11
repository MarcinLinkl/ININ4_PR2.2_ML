package com.company.devices;

import com.company.Human;


public class Phone extends Device {

    public Phone(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    void turnOn() {
        System.out.println("Device one!");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() < price) {
            throw new Exception("Not enough money, my friend!");
        }
        if (seller.phone != this) {
            throw new Exception("You do not have that!");
        }
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        buyer.phone = this;
        seller.phone = null;
        System.out.println(buyer.firstName + " bought " + this + " from " + seller.firstName + " for " + price);
    }
}
