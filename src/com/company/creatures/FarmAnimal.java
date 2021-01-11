package com.company.creatures;

public class FarmAnimal extends Animal  {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void feed() {
        weight=+0.1;
    }

    @Override
    public void feed(Double foodWeight) {
        weight=+foodWeight;
    }

    @Override
    public void beEaten() {
        System.out.println("Where I am ?");
    }
}


