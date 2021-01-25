package com.company.devices;

public class Application implements Comparable<Application> {


    public Application(String applicationName, String version, double cost) {
        this.applicationName = applicationName;
        this.version = version;
        this.cost = cost;
    }

    public String applicationName;
    public String version;
    public double cost;

    @Override
    public int compareTo(Application o) {
        return Double.compare(this.cost, o.cost);
    }
}

