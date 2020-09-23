package com.company;

public class Animal {

    public static final Double DEFAULT_DOG_WEIGHT = 20.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 4.220;
    public static final Double DEFAULT_LION_WEIGHT = 43.0;
    final String species;
    private Double weight;
    String name;


    public Animal(String species) {
        this.species = species;

        if (species == "dog") {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "lion") {
            weight = DEFAULT_LION_WEIGHT;
        } else if (species == "mouse") {
            weight = DEFAULT_MOUSE_WEIGHT;
        }
    }


    void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("Dziękówka");
            System.out.println("Najadłem się. Moja waga to teraz: " + this.weight);
        } else {
            System.out.println("Teraz to jestem martwy i możesz się tym wypchać!");
            System.out.println("Moja waga to teraz: " + this.weight);

        }
    }
    void takeForAWalk() {
        if (weight <= 0) {
            System.out.println("I am dead.");
        } else {
            weight--;
            if (weight > 0) {
                System.out.println("Dzięki za spacer, lubię to! :)");
                System.out.println("My wieght is " + Math.round(weight * 1000) / 1000.00);
            } else
                System.out.println("No to trochę przesadziłeś, teraz to zdechłem. Idź w cholerę !!!");
        }
    }

}
