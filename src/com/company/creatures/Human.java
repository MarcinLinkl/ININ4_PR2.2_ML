package com.company.creatures;

import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


import static java.util.Objects.nonNull;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Animal farmAnimal;

    public Phone phone;
    private Double cash;
    public Car[] garage;

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Human(String firstName, String lastName, Double cash) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.weight = 70.0;
        this.garage = new Car[3];
    }

    public Human(String firstName, String lastName, Double cash, int garageSize) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.weight = 70.0;
        this.garage = new Car[garageSize];
    }

    public void setPhone(Phone phone) {
        this.phone = phone;

    }

    public void setCar(Car car, int place) {
        this.garage[(place - 1)] = car;
    }


    public Car getCar(int number) {
        return this.garage[number];
    }


    public float allCarsPrice() {
        float sum = 0f;
        for (Car car : garage) {
            if (car != null) {
                sum += car.getValue();
            }
        }
        return sum;
    }

    public void removing(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == newCar) {
                this.garage[i] = null;
            }
        }
    }

    public int freePlaceInGarage() {
        int x = 0;
        for (int i = 1; i <= this.garage.length; i++) {
            if (this.getCar((i - 1)) == null) {
                x = i;
                break;
            }

        }
        return x;
    }

    public boolean isSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }

        }
        return false;
    }


    public boolean hasCar(Car thatCar) {
        for (Car car : garage) {
            if (car == thatCar) {
                return true;
            }
        }
        return false;
    }

    public void showMyCars() {
        for (int i = 0; i < this.garage.length; i++) {
            if (nonNull(this.getCar(i)))
                System.out.println(this.firstName + " " + (i + 1) + " place car: " + this.getCar(i).producer + " " + this.getCar(i).model + " from " + this.getCar(i).yearOfProduction);
        }

    }



    @Override
    public void beEaten() {

    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
