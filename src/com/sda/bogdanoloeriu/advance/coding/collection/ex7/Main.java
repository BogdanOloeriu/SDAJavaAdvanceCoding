package com.sda.bogdanoloeriu.advance.coding.collection.ex7;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Create a method that accepts TreeMap and prints the first and last Entry in the console.
 */

public class Main {

    public static void main(String[] args) {

        TreeMap<String,String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.put("Bmw","X6");
        treeMap.put("Kia","Sportage");
        treeMap.put("Ford","Cmax");
        treeMap.put("Dacia","Spring");

        printFirstAndLastEnd(treeMap);
    }
    //hashMap este neodornat
    //treeMap este un map sortat., nu mai are tabela de heshing, are o tabela de arbore, tree map va ramane mereu sortat in functie de un comparator
    //fata de hash map are metode de get, first

    public static void printFirstAndLastEnd(TreeMap<String,String> treeMapInput){

        System.out.println("first entry: " + treeMapInput.firstEntry());
        System.out.println("Last entry: " + treeMapInput.lastEntry());
    }

}
