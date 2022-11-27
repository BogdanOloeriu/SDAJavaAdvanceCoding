package com.sda.bogdanoloeriu.advance.coding.collection.ex9;

/**
 * Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your animals:
 *  int getNumberOfAllAnimals() → returns the number of all animals Map
 * getAnimalsCount() → returns the number of animals of each species Map
 * void addAnimals(String, int) → adds n animals of a given species
 */

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimals("Lion",2);
        zoo.addAnimals("Snake",3);
        zoo.addAnimals("Snake",4);

        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());
    }
}
