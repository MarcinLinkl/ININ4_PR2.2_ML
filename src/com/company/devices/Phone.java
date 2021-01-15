package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;


public class Phone extends Device {

    private static final String DEFAULT_APP_PROTOCOL = "HTTP";
    private static final String DEFAULT_APP_SERVER = "application.store.com";
    private static final int DEFAULT_APP_NUMBER = 80;

    public Phone(String model, String producer, int yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
    }


    @Override
    void turnOn() {
        System.out.println("Device on!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() < price) {
            throw new Exception("Not enough money, my friend!");
        }
        if (seller.phone != this) {
            throw new Exception("You do not have that!");
        }
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        buyer.phone = this;
        seller.phone = null;
        System.out.println(buyer.firstName + " bought " + this + " from " + seller.firstName + " for " + price);
    }

    public void installAnnApp(String[] names) throws Exception {
        if (names.length ==0){
            throw new Exception("Brak nazw aplikacji do instalacji");
        }
        System.out.println("Instalowanie aplikacji z listy");
        for (String name : names) {
            this.installAnnApp(name);
        }

    }

    public void installAnnApp(String name) throws Exception {
        if(name.equals("")){
            throw new Exception("Brak nazwy aplikacji do instalacji");
        }
        System.out.println("Instalowanie aplikacji z nazwy");
        this.installAnnApp(name,"latest");
    }

    public void installAnnApp(String name, String version) throws MalformedURLException {
        System.out.println("Instalowanie z nazwy i wersji");
        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_APP_NUMBER, name + "-" + "version");
        this.installAnnApp(url);
    }

    public void installAnnApp(URL url) {
        System.out.println("Instalowanie z urla");
        System.out.println("poprawnie zainstalowano " + url.getFile() + " z serwera " + url.getHost());

    }

    @Override
    public int compareTo(Device o) {
        return 0;
    }
}
