package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    private Car car;
    private Double salary;
    private Double cash;


    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }


    @Override
    public String toString() {
        return "Human {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone=" + phone +
                ", car=" + car +
                ", salary=" + salary +
                ", lastSalary=" + lastSalary +
                ", lastCheckSalary=" + lastCheckSalary +

                '}';
    }

    Double lastSalary;
    LocalDateTime lastCheckSalary;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


    public Human(String firstName, String lastName, Double cash) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.weight = 70.0;
    }

    public Double getSalary() {
        System.out.println("\u001B[34m");
        if (lastCheckSalary == null) {
            System.out.println("Last salary check was never done");
        } else {
            System.out.println("Last check of salary was at : " + dtf.format(lastCheckSalary) + " And the salary value was: " + lastSalary + " PLN");
        }
        lastCheckSalary = LocalDateTime.now();
        lastSalary = salary;
        System.out.print("Now your salary is " + salary + " PLN");
        System.out.println("\u001B[0m");
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("\u001B[31m" + "Hey, please don't do it! - You can't give him negative value" + "\u001B[0m");
        } else {
            this.salary = salary;
            System.out.println("\u001B[31m" + "Nice, You were a good worker!And for now your salary jumped up to: " + salary + " PLN");
            System.out.println("Information about new salary has been just sent to accounting system.");
            System.out.println("Now, please pick up new annex o the contract from Ms.Hania at the HR department. It's important. ");
            System.out.println("Now, don't even think of about hiding your income. ZUS and US have already full knowledge about it :) " + "\u001B[0m");

        }

    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void buyNewCar(Car car) {
        if (this.salary >= car.value) {
            System.out.println("Congrats, you bought the car.");
            this.car = car;
        } else if (this.salary >= car.value / 12.0) {
            System.out.println("Smile buddy, you bought it on credit.");
            this.car = car;
        } else {
            System.out.println("Sorry buddy, lets better find a new job! :(");
        }
    }
}
