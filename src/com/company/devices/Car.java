package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    Integer horsePower;
    public Double price;
    List<Human> ownerList = new ArrayList<Human>();


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
            throw new Exception("Dealer don`t have this car right now");
        }
        if (ownerList.size() -1 >= 0) {
            if (!ownerList.get(ownerList.size() - 1).equals(seller)) {
                throw new Exception("Dealer isn`t owner of the car");
            }
        } else
            ownerList.add(seller);
        {
            if (buyer.getCash < price) {
                throw new Exception("Dude you are broken");
            }
            if (!buyer.isFreeSpace()) {
                throw new Exception("Place is full");
            }
            System.out.println(seller.firstName + seller.getCash);
            System.out.println(buyer.firstName + buyer.getCash);
            buyer.setCash(buyer.getCash - price);
            seller.setCash(seller.getCash + price);
            buyer.addCar(this);
            seller.removeCar(this);
            ownerList.add(buyer);

        }
    }

    public void Owner(Human human) {
        int x = 0;
        for (Human ownerList : ownerList) {
            if (ownerList.equals(human)) {
                x++;
                break;
            }
        }
        if (x > 0)
            System.out.println(" is owner");
        else {
            System.out.println(" wasn`t the owner");
        }
    }
        public abstract int compareTo (Car o);


        @Override
        void turnOn () {
        }

        public void TurnOn () {
            System.out.println("Hello driver, I am your professional driving assistant ");
        }

        @Override
        public String toString () {
            return "Producer: " + producer + "\n" +
                    "Model:" + model + "\n" +
                    "Year: " + year + "\n" +
                    "Value: " + value;
        }


    }
