package com.company;


import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Marcin", "Li", 600.0);
//        Car peugot206 = new Car("Peugot", "206", 60, 1.1f, 2002, 7000);
//        me.setSalary(20000.0);
//        me.buyNewCar(peugot206);
//        System.out.println("My car for now: " + me.getCar());
//
//        Human you = new Human("Andrzej", "Andrzejewski", 2300.0);
//        you.setSalary(400.0);


        me.pet = new Pet("dog");
        me.pet.name= "Klemens";
        me.feed(0.1);
        me.pet.feed();
        //me.pet.beEaten();
        System.out.println(me.pet);



        me.farmAnimal = new FarmAnimal("pig");
        me.farmAnimal.name="Stefan";
        me.farmAnimal.feed(2.3);
        System.out.println(me.farmAnimal);
        me.farmAnimal.beEaten();


    }
}



