package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species) {
        super(species);
    }

    @Override
    public void beEaten() throws Exception {
        throw new Exception("You cant eat your own pet, that is sick!!!");
    }


    @Override
    public void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("Thx! That was nice. Your pet weigh is: " + this.weight);
        } else {
            System.out.println("Damn! I am dead, You can't feed me.");

        }
    }

    @Override
    public void feed(Double foodWeight) {
        if (weight > 0) {
            weight = +foodWeight;
            System.out.println("Thx!");
            System.out.println("That was nice my weigh is: " + this.weight);
        } else {
            System.out.println("Damn! I am dead, You can't feed me.");

        }
    }
}