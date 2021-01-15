package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

import java.time.Year;

public abstract class Car extends Device  {

    final public int horsepower;

    public Car(String model, String producer, int yearOfProduction, Double value, int horsepower) {
        super(model, producer, yearOfProduction, value);
        this.horsepower = horsepower;
    }


    @Override
    void turnOn() {
        System.out.println("Car on!");
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this)){
            throw new Exception("You don't have this vehicle, man!!!");
        }
        if (buyer.getCash() < price) {
            throw new Exception("Find a better job, man!");
        }
        if (!buyer.isSpace() ) {
            throw new Exception("Aint space, man!");
        }
        System.out.println("\nOk. Make a deal!");
        System.out.println(seller.firstName +" had " +seller.getCash()+ " before the transaction");
        System.out.println(buyer.firstName +" had " +buyer.getCash()+ " before the transaction");
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        buyer.setCar(this, buyer.freePlaceinGarage());
        seller.removing(this);
        System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        System.out.println(seller.firstName +" have " +seller.getCash()+ " after the transaction");
        System.out.println(buyer.firstName +" have " +buyer.getCash()+ " after the transaction\n");
    }

    public abstract void refuel();

    public abstract int compareTo(Car o);

    @Override
    public String toString() {
        return "\nCar{" +
                "horsepower=" + horsepower +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }
}
