package com.company.devices;

public abstract class LPG extends Car {
    Integer horsePower;
    public Double price;

    public LPG(String producer, String model, Integer year, Integer horsePower, Double price, Double value) {
        super(producer, model, year, value);
        this.horsePower = horsePower;
        this.price = price;
    }

    public void refuel(String fuelType) {
        System.out.println("You're trying to refuel:" + " " + this.producer + " " + this.model + " with " + fuelType);
        if (fuelType == "LPG") {
            System.out.println("Refueling successful");
        } else {
            System.out.println("This car uses only LPG");
        }
    }

    public int compareTo(Car o) {
        return 0;
    }

}
