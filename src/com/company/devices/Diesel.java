package com.company.devices;

public class Diesel extends Car{
    final public float engineCapacity;

    public Diesel(String model, String producer, int yearOfProduction, Double value, int horsepower, float engineCapacity) {
        super(model, producer, yearOfProduction, value, horsepower);
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void refuel() {
        System.out.println("Now oil full!");
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    @Override
    public String toString() {
        return "\nDiesel{" +
                "horsepower=" + horsepower +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
