package com.company;

public class Main {

    public static void main(String[] args) {

        Animal mouse = new Animal("mouse");
        mouse.name = "Basia";
        System.out.println("Cześć! Tu twoja mysz  " + mouse.name +".");

        for (int i = 0; i < 3; i++) {
            mouse.feed();
        }

        for (int i = 0; i < 13; i++) {
            mouse.takeForAWalk();
        }
    }

}
