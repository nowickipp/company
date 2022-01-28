package com.company;


import com.company.devices.*;
import com.company.farmVille.FarmAnimal;
import com.company.farmVille.Pet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human("John", "Doe");
        me.pet = new Pet("dog");
        Phone iPhone = new Phone("Iphone", "13", 2021, 2000.0);
        Human newSeller = new Human("Johnatan", "Doe");
        Human dealer = new Human("Mike", "Dealer");
        me.cash = 10000.0;
        newSeller.cash = 2000.0;
        FarmAnimal horse = new FarmAnimal("horse");
        Diesel ford = new Diesel("ford", "mondeo", 2010, 200, 20000.00, 200000.0);
        Electric tesla = new Electric("model s", "tesla", 2020, 200, 200000.00, 200000.0);
        Diesel audi = new Diesel("a4", "audi", 2015, 200, 200000.00, 200000.0);

        System.out.println(" \n \" DOGGO \" \n ");

        me.pet.feed(5.0);
        me.pet.feed(6.0);
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed(3.0);
        me.pet.feed(2.0);
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();



        System.out.println(" \n \" ANIMAL \" \n ");
        System.out.println(me.pet);



        System.out.println(" \n \" PHONE TURN ON \" \n ");
        iPhone.TurnOn();

        System.out.println(" \n \" ANIMAL SELLING \" \n ");
        me.pet.Sell(me, newSeller, 500.0);

        System.out.println(" \n \" FARM ANIMAL\" \n ");
        horse.beEaten();

        System.out.println(" \n \" APP INSTALATION\" \n ");
        iPhone.TurnOn();
        iPhone.installAppNo1("Instagram");
        iPhone.installAppNo2("Facebook"," 2.0");
        iPhone.installAppNo3("Snapchat"," 2.0"," snapchat.com");


        System.out.println(" \n \" GARAGE\" \n ");
        me.setCar(ford, 1);
        me.setCar(audi, 2);
        me.myCars();
        System.out.println("Your cars value: " + me.carValue() + " PLN");
    }
}