package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;


public class Phone extends Device {
    public Set<Application> setApplications = new HashSet<>();
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
        if (names.length == 0) {
            throw new Exception("Brak nazw aplikacji do instalacji");
        }
        System.out.println("Instalowanie aplikacji z listy");
        for (String name : names) {
            this.installAnnApp(name);
        }

    }

    public void installAnnApp(String name) throws Exception {
        if (name.equals("")) {
            throw new Exception("Brak nazwy aplikacji do instalacji");
        }

        System.out.println("Instalowanie aplikacji z nazwy");
        this.installAnnApp(name, "latest");
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

    public void installAnnApp(Application app, Human who, Phone which) throws Exception {
        if (app.cost > who.getCash()) {
            System.out.println("You dont have that much money - my friend");
        }
        who.setCash(who.getCash() - app.cost);
        System.out.println("You bought the " + app.applicationName);
        which.setApplications.add(app);
        System.out.println("Instalation complete!");
        System.out.println(app.applicationName + " added to application set.");
        this.installAnnApp(app.applicationName);
    }


    public boolean isInstalled(Application app) {
        return this.setApplications.contains(app);
    }

    public boolean isInstalled(String appsName) {
        for (Application apps : this.setApplications) {
            if (apps.applicationName == appsName) {
                return true;

            }

        }
        return false;
    }

    public void freeApps() {
        System.out.println("Free apps:");
        for (Application app : this.setApplications) {
            if (app.cost == 0.0) {
                System.out.println(app.applicationName);
            }
        }
    }

    public double allAppsValue() {
        double sum = 0;
        for (Application app : this.setApplications) {
            sum += app.cost;
        }
        return sum;
    }

    public void allAppsAlphabetically() {
        List<String> list = new ArrayList<>();
        for (Application app : this.setApplications) {
            list.add(app.applicationName);
        }
        System.out.println(list);
    }

    public void allInstalledAppsFromCheapest() {
        List<Application> listOne = new ArrayList<>(setApplications);
        Collections.sort(listOne);
        for (Application apo : listOne){
            System.out.println(apo.applicationName +" "+ apo.cost);
        }


    }


    @Override
    public int compareTo(Device o) {
        return 0;
    }
}
