package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Feedable, Edible {

    public static final Double DEFAULT_DOG_WEIGHT = 20.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 4.220;
    public static final Double DEFAULT_LION_WEIGHT = 43.0;
    public static final Double DEFAULT_PIG_WEIGHT = 143.0;
    public final String species;
    protected Double weight;
    public String name;
    File pic;


    @Override
    public String toString() {
        return "Animal {" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public Animal(String species) {
        this.species = species;
        if (species == "homo sapiens") {
        } else {
            if (species == "dog") {
                this.weight = DEFAULT_DOG_WEIGHT;
            } else if (species == "lion") {
                this.weight = DEFAULT_LION_WEIGHT;
            } else if (species == "mouse") {
                this.weight = DEFAULT_MOUSE_WEIGHT;
            } else if (species == "pig") {
                this.weight = DEFAULT_PIG_WEIGHT;
            }
            System.out.println("Hey that's your " + this.species + " " + this.name + ". Hello!");
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


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("Actually, slavery is forbidden .:(");
        } else if (seller.pet != this) {
            System.out.println("Oh no! Dont fuck with me! You don't have pet! >:{ ");
        } else if (buyer.getCash() >= price) {
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            buyer.pet = this;
            seller.pet = null;

            System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        } else {
            throw new Exception("you can't afford it");
        }
    }
}
