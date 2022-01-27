package com.company.devices;

public abstract class Device {
    final String producer;
    final String model;
    final Integer year;

    protected Device(String producer, String model, Integer year) {
        this.producer = producer;
        this.model = model;
        this.year = year;
    }

    abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "Producer:'" + producer + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year +
                '}';
    }


}
