package com.company.devices;

public class Electric extends Car {
    Integer horsePower;
    public Double price;

    public Electric(String producer, String model, Integer year, Integer horsePower, Double price) {
        super(producer, model, year);
        this.horsePower = horsePower;
        this.price = price;
    }

    public void refuel(String fuelType) {
        System.out.println("You're trying to recharge: " + this.producer + " " + this.model + " with " + fuelType);
        if (fuelType == "Electric") {
            System.out.println("Recharging successful");
        } else {
            System.out.println("This car is ELECTRIC!");
        }
    }

}