package com.company.farmVille;

public class FarmAnimal extends Animal implements Edible {
    boolean eaten = false;
    public FarmAnimal(String species) {
        super(species);
    }



    public void beEaten() {
        if(!eaten){
            eaten = true;
        System.out.println(this.species + " has been eaten.");
    } else{
        System.out.println(this.species + "cant be eaten");
        }

    }

}