package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    Integer horsePower;
    public Double price;


    public Car(String model, String producer, Integer year, Double value) {
        super(model, producer, year, value);
        this.model = model;
        this.producer = producer;
        this.year = year;
    }

    public void refuel(String fuelType) {

    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.haveCar(this)) {
            throw new Exception("Dealer dont have this car right now");
        }
        if (buyer.getCash < price) {
            throw new Exception("Dude you are broken");
        }
        if (!buyer.isFreeSpace()) {
            throw new Exception("Place is full");
        }
        System.out.println(seller.firstName + seller.getCash);
        System.out.println(buyer.firstName + buyer.getCash);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        buyer.setCar(this, buyer.freePlace());
        seller.removeCar(this);
        System.out.println(seller.firstName + seller.getCash);
        System.out.println(buyer.firstName + buyer.getCash);
    }

    public abstract int compareTo(Car o);


    @Override
    void turnOn() {
    }

    public void TurnOn() {
        System.out.println("Hello driver, I am your professional driving assistant ");
    }

    @Override
    public String toString() {
        return "Producer: " + producer + "\n" +
                "Model:" + model + "\n" +
                "Year: " + year + "\n" +
                "Value: " + value;
    }


}