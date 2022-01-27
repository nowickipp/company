package com.company.devices;

public class Phone extends Device {
    public Phone(String producer, String model, Integer year) {
        super(producer, model, year);
    }


    public void TurnOn() {
        System.out.println("Hello user, i'm your mobile phone personal assistant!");
    }


    @Override
    void turnOn() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

}

