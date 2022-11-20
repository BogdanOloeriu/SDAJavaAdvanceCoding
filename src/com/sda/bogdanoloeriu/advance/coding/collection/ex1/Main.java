package com.sda.bogdanoloeriu.advance.coding.collection.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex 1 - Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A.
 */


public class Main {


    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("Bogdan");
        stringList.add("Car");
        stringList.add("Bike");
        stringList.add("Truck");

        sortList(stringList);
        System.out.println(sortList(stringList));


    }

    public static List<String> sortList(List<String> list) {

        List<String> sortedList = new ArrayList<>();
//        for(String el : list){
//            sortedList.add(el);
//        }
        sortedList.addAll(list);
        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o2.compareTo(o1);
                System.out.println(o1 + " compared with " + o2 + " is " + result);

                return result;
            }
        });

        return sortedList;
    }

    public static List<String> sortLambdaList(List<String> list) {

        List<String> sortedList = new ArrayList<>();
//        for(String el : list){
//            sortedList.add(el);
//        }
        sortedList.addAll(list);

        sortedList.sort((o1, o2) -> {
            int result = o2.compareTo(o1);
            System.out.println(o1 + " compared with " + o2 + " is " + result);

            return result;
        });

        return sortedList;
    }

    public static List<String> sortStreamList(List<String> input) {

        return input.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }


}
