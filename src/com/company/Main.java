package com.company;


import com.company.creatures.Human;
import com.company.devices.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Marcin", "Li", 600.0);
        Human Jacob = new Human("Jakub", "Kowal", 1200.0, 4);
        Human Leszek = new Human("Leszek", "Leszkowski", 200000d, 12);
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


        SkodaFabia.sell(me, Jacob, 230d);
        SkodaFabia.sell(Jacob, Leszek, 20.0);

        me.showMyCars();
        Jacob.showMyCars();
        Leszek.showMyCars();


        SkodaFabia.wasHeTheOwner(Leszek);
        SkodaFabia.wasHeTheOwner(me);

        SkodaFabia.didHeSell(me, Leszek);
        SkodaFabia.didHeSell(me, Jacob);

        SkodaFabia.howManyTransaction();


        Application WhatsApp = new Application("WhatsApp", "1.2.3", 0.0);
        Application Jelly = new Application("Jelly", "1.2.3", 0.0);
        Application Monopoly = new Application("Monopoly", "2.2.3", 9.99);
        Application HeroesNine = new Application("HeroesNine", "1.0.3", 14.99);
        Application Lightroom = new Application("Lightroom", "1.0.3", 49.99);


        Phone xiaomiNote10lite = new Phone("Note10lite", "Xiaomi", 2020, 1599.0);
        me.setPhone(xiaomiNote10lite);

        me.phone.installAnnApp(WhatsApp, me, xiaomiNote10lite);
        me.phone.installAnnApp(Monopoly, me, xiaomiNote10lite);
        me.phone.installAnnApp(HeroesNine, me, xiaomiNote10lite);
        me.phone.installAnnApp(Lightroom, me, xiaomiNote10lite);
        me.phone.installAnnApp(Jelly, me, xiaomiNote10lite);

        System.out.println(xiaomiNote10lite.isInstalled(WhatsApp));
        System.out.println(xiaomiNote10lite.isInstalled(Lightroom));
        System.out.println(xiaomiNote10lite.isInstalled("WhatsApp"));
        System.out.println(xiaomiNote10lite.isInstalled("PuzzleMap"));

        xiaomiNote10lite.freeApps();
        System.out.println(me.phone.allAppsValue());
        System.out.println(xiaomiNote10lite.allAppsValue());
        xiaomiNote10lite.allAppsAlphabetically();
        xiaomiNote10lite.allInstalledAppsFromCheapest();

    }
}



