package com.company.devices;

public class Car extends Device {
    Integer horsePower;
    public Double price;


    public Car(String producer, String model, Integer year, Integer horsePower, Double price) {
        super(producer, model, year);
        this.horsePower = horsePower;
        this.price = price;
    }

    public Car(String producer, String model, Integer year) {
        super(producer, model, year);
    }


    public void refuel(String fuelType) {

    }


    @Override
    public String toString() {
        return "Car:" + "\n" +
                "Producer:" + producer + "\n" +
                "Model:" + model + "\n" +
                "Year:" + year + "\n" +
                "Price:" + price + " PLN"
                ;
    }

    @Override
    void turnOn() {
    }

    public void TurnOn() {
        System.out.println("Hello driver, I am your professional driving assistant ");
    }

}