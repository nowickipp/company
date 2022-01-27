package com.company;


import com.company.devices.*;
import com.company.farmVille.FarmAnimal;
import com.company.farmVille.Pet;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();

        me.firstName = "John";
        me.lastName = "Doe";
        me.pet = new Pet("dog");
        Car volvo = new Car("volvo", "s90", 2010, 200, 3500.0);
        Car volvo2 = new Car("volvo", "s90", 2010, 200, 35000.0);
        Phone iPhone = new Phone("Iphone", "13", 2021);
        Human newSeller = new Human();
        me.cash = 10000.0;
        newSeller.cash = 2000.0;
        FarmAnimal horse = new FarmAnimal("horse");
        Electric tesla = new Electric("Tesla", "Model S", 2021, 200, 200000.0);
        Diesel ford = new Diesel("Ford", "Mondeo", 2019, 150, 60000.0);
        LPG fiat = new LPG("Fiat", "Panda", 2010, 65, 12000.0);


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


        System.out.println(" \n \" CAR \" \n ");
        me.setMachine(volvo);


        System.out.println(" \n \" CAR COMPRASION  \" \n ");
        System.out.println("Are they the same cars?");
        System.out.println(volvo == volvo2);


        System.out.println(" \n \" CAR \" \n ");
        System.out.println(volvo);


        System.out.println(" \n \" ANIMAL \" \n ");
        System.out.println(me.pet);


        System.out.println(" \n \" CAR START \" \n ");
        volvo.TurnOn();


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


        System.out.println(" \n \" GAS STATION\" \n ");
        tesla.refuel("Electric");
        tesla.refuel("LPG");
        ford.refuel("Diesel");
        ford.refuel("Electric");
        fiat.refuel("LPG");
        fiat.refuel("Diesel");


    }
}