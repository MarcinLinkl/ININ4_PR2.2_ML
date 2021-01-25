package com.company.devices;

public class Electric extends Car {


    public Electric(String model, String producer, int yearOfProduction, Double value, int horsepower) {
        super(model, producer, yearOfProduction, value, horsepower);
    }

    @Override
    public void refuel() {
        System.out.println("Car is fully charged!");
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    @Override
    public String toString() {
        return "\nElectric{" +
                "horsepower=" + horsepower +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }
}
