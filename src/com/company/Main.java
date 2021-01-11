package com.company;


import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Marcin", "Li", 600.0);
        Car peugot206 = new Car("Peugot", "206", 60, 1.1f, 2002, 7000);

        me.setSalary(20000.0);

        me.buyNewCar(peugot206);
        System.out.println("My car for now: " + me.getCar());

        Human you = new Human("Andrzej", "Andrzejewski", 2300.0);
        you.setSalary(400.0);
        peugot206.sell(me, you, 2200.0);


    }
}



