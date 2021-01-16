package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;
import com.company.creatures.OwnersOfCar;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

public abstract class Car extends Device {
    public LocalDateTime time;
    final public int horsepower;
    public List<OwnersOfCar> listOfOwners = new ArrayList<>();


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
        if (!seller.hasCar(this)) {
            throw new Exception("You don't have this vehicle, man!!!");
        }
        if (buyer.getCash() < price) {
            throw new Exception("Find a better job, man!");
        }
        if (!buyer.isSpace()) {
            throw new Exception("Aint space, man!");
        }
        System.out.println("\nOk. Make a deal!");
        System.out.println(seller.firstName + " had " + seller.getCash() + " before the transaction");
        System.out.println(buyer.firstName + " had " + buyer.getCash() + " before the transaction");
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        buyer.setCar(this, buyer.freePlaceinGarage());
        seller.removing(this);
        this.listOfOwners.add(new OwnersOfCar(buyer, seller, price));
        System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        System.out.println(seller.firstName + " have " + seller.getCash() + " after the transaction");
        System.out.println(buyer.firstName + " have " + buyer.getCash() + " after the transaction\n");
    }
    public void wasHeTheOwner (Human he) {
        for (OwnersOfCar OwnersOfCar : listOfOwners) {
            if (OwnersOfCar.newOwner == he) {
                System.out.println("Yes - Actually, he is now the owner this car");
            }
            else if (OwnersOfCar.lastOwner == he) {
                System.out.println("Yes - he was the owner of this car in the past");
                }
            else {
                System.out.println("Nope, he wasn't ( owner of this car)");
            }
            return;
            }
        }

    public void didHeSell(Human aSeller, Human bBuyer ){
        for (OwnersOfCar OwnersOfCar : listOfOwners) {
            if (OwnersOfCar.lastOwner == aSeller && OwnersOfCar.newOwner==bBuyer){
                System.out.println("Yes - "+ aSeller.firstName + " "+aSeller.lastName +" have sold this car " +bBuyer.firstName+" "+bBuyer.lastName );
            }
            else {
                System.out.println("No, he never done it!!!~1 ( sold him this car )");
            }
            return;
        }
    }

    public void  howManyTransaction()
    {
        System.out.println("This has been "+ this.listOfOwners.size() + " times sold");
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
