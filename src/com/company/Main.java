package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Marcin", "Li");
        me.pet = new Animal("mouse", "Baśka");
        me.car = new Car("Peugot","206",60,1.1f,2002);


        System.out.println("Cześć! Tu twoja mysz " + me.pet.getName() + ".");
        for (int i = 0; i < 3; i++) {
            me.pet.feed();
        }
        for (int i = 0; i < 13; i++) {
            me.pet.takeForAWalk();
        }


        System.out.println("Parametry mojego auta cacka:\n"+me.car.producer + "\n"+ me.car.model+ "\nEngine: "+ me.car.horsepower + "HP\t" + me.car.engineCapacity + "l\n"+me.car.yearOfProduction);

    }
}



