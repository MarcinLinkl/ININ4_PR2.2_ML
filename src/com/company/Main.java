package com.company;


import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Marcin", "Li");
        me.pet = new Animal("mouse", "Baśka");
        Car peugot206 = new Car("Peugot", "206", 60, 1.1f, 2002, 7000);
        Car peugot206_2 = new Car("Peugot", "206", 60, 1.1f, 2002, 7000);


        for (int i = 0; i < 3; i++) {
            me.pet.feed();
        }
        for (int i = 0; i < 13; i++) {
            me.pet.takeForAWalk();
        }

        me.setSalary(1000.0);
        me.getSalary();
        me.setSalary(20000.0);
        me.getSalary();

        me.setCar(peugot206);
        System.out.println("My car for now: " + me.getCar());

        System.out.println(peugot206);
        System.out.println(peugot206_2);
        System.out.println((peugot206==peugot206_2));

        System.out.println(me);
        System.out.println(me.pet);


    }
}



