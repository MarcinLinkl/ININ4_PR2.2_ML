package com.company.devices;

public class LPG extends Car {
    final public float engineCapacity;

    @Override
    public String toString() {
        return "\nLPG{" +
                "horsepower=" + horsepower +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public LPG(String model, String producer, int yearOfProduction, Double value, int horsepower, float engineCapacity) {
        super(model, producer, yearOfProduction, value, horsepower);
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void refuel() {
        System.out.println("Now gas full!");
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
