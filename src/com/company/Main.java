package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.farmVille.FarmAnimal;
import com.company.farmVille.Pet;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();

        me.firstName = "John";
        me.lastName = "Doe";
        me.pet = new Pet("dog");
        Car volvo = new Car("volvo", "s90", 200, 2010, 3500.0);
        Car volvo2 = new Car("volvo", "s90", 200, 2010, 35000.0);
        Phone iPhone = new Phone("Iphone", "13", 2021);
        Human newSeller = new Human();
        me.cash = 10000.0;
        newSeller.cash = 2000.0;
        FarmAnimal horse = new FarmAnimal("horse");


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






    }
}