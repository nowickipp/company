package com.company.farmVille;

import com.company.Human;
import com.company.Sellable;

public class Animal implements Sellable {
    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = 10.0;
        }
    }

    private boolean isAlive() {
        return this.weight >= 0;
    }

    boolean isObese() {
        return this.weight >= 15;
    }



    @Override
    public void feed(Double foodweight) {
        if (isAlive()) {
            this.weight+= foodweight;
            System.out.println("Yum Yum Yum, Your animal weight is: " + this.weight + " kg");
        }
        if (isObese()) {
            System.out.println("DAMN BOi HE THICC, THATS THICC ASS BOI");
        }
    }

    public void takeForAWalk() {
        if (isAlive()) {
            this.weight--;
            System.out.println("I'm a ha-ppy ha-ppy dog, yes I'm a happy happy happy dog. Your animal weight is: " + this.weight + " kg");
        } else System.out.println("Dude, your pet will unfortunately not go anywhere anymore!");
    }


    @Override
    public String toString() {
        return "Animal:" + "\n" +
                "Animal type: " + species + "\n" +
                "Animal weight: " + weight + "kg"
                ;
    }

    public void Sell(Human seller, Human buyer, Double price) {
        if (seller.pet !=null & buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Pet has been sold :<");
        } else {
            System.out.println("Potential new owner doesn`t have enough money ");
        }
    }



    }








