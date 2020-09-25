package com.company;

public class Animal {

    public static final Double DEFAULT_DOG_WEIGHT = 20.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 4.220;
    public static final Double DEFAULT_LION_WEIGHT = 43.0;
    final private String species;
    private Double weight;

    @Override
    public String toString() {
        return "Animal {" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    final private String name;
    public String getName() {
        return name;
    }

    public Animal(String species, String name) {
        this.name = name;
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }
        System.out.println("Hey that's your "+ this.species + " " + this.name + ". Hello!");
    }


    void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("Thx!");
            System.out.println("That was nice my weigh is: " + this.weight);
        } else {
            System.out.println("Damn! I am dead.");

        }
    }
    void takeForAWalk() {
        if (weight <= 0) {
            System.out.println("I am dead.");
        } else {
            weight--;
            if (weight > 0) {
                System.out.println("Thank you bro, I like wasting time to get around :)");
                System.out.println("My weight is " + Math.round(weight * 1000) / 1000.00);
            } else
                System.out.println("Oh Oh oh! Wait man. I'm dead, cause not ate! :)");
        }
    }


}
