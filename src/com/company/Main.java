package com.company;


import com.company.creatures.Human;
import com.company.devices.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Marcin", "Li", 600.0);
        Human Jacob = new Human("Jakub", "Kowal", 1200.0, 4);
        LPG Peugot206 = new LPG("206", "Peugot", 2002, 2000.0, 60, 1.1f);
        Diesel SkodaFabia = new Diesel("Fabia", "Skoda", 2007, 17000.0, 105, 1.6f);
        Electric TeslaS = new Electric("S", "Tesla", 2020, 350000.0, 306);

        me.setCar(TeslaS, 1);
        me.setCar(SkodaFabia, 2);
        me.setCar(Peugot206, 3);

        me.showMyCars();
        System.out.println(me.firstName + " all cars value is " + me.allCarsPrice() + " PLN");

        Arrays.sort(me.garage);
        me.showMyCars();

        Jacob.setCar(TeslaS,1);
        Jacob.showMyCars();

        Peugot206.sell(me, Jacob, 200.0);
        SkodaFabia.sell(me,Jacob,23d);

        me.showMyCars();
        Jacob.showMyCars();









    }
}



