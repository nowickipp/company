package com.company.devices;

import com.company.Sellable;

public abstract class Device implements Comparable<Car> {
    Double value;
    String producer;
    String model;
    Integer year;

    protected Device(String producer, String model, Integer year, Double value) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    public Double getValue(){
        return this.value;
    }
    public int compareTo(Car o){
        return this.year - o.year;
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
