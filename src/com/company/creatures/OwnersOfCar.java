package com.company.creatures;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OwnersOfCar {
    public Human newOwner;
    public Human lastOwner;
    double price;
    public LocalDateTime timeOfTransaction;


    @Override
    public String toString() {
        return "\nList of Owners \n" +
                "newOwner = " + newOwner.firstName + " " + newOwner.lastName +
                ", lastOwner = " + lastOwner.firstName + " " + lastOwner.lastName +
                ", price = " + price +
                ", timeOfTransaction = " + timeOfTransaction +
                '}';
    }

    public OwnersOfCar(Human newOwner, Human lastOwner, double price) {
        this.newOwner = newOwner;
        this.lastOwner = lastOwner;
        this.price = price;
        this.timeOfTransaction = LocalDateTime.now();
    }

}
