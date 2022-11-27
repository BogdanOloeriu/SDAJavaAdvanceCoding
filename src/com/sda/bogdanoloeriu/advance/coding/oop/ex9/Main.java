package com.sda.bogdanoloeriu.advance.coding.oop.ex9;

import java.util.Arrays;

/**
 * Extend the ArrayList class by implementing the getEveryNthElement() method. This method returns a list of elements
 * and takes two parameters: the element index from which it starts and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 * ArrayList is a class -> extend a class -> deci tot o clasa
 */

public class Main {

    public static void main(String[] args) {

        SdaArrayList<String> stringSdaArrayList = new SdaArrayList<>();
        stringSdaArrayList.add("a");
        stringSdaArrayList.add("b");
        stringSdaArrayList.add("c");
        stringSdaArrayList.add("d");
        stringSdaArrayList.add("e");
        stringSdaArrayList.add("f");
        stringSdaArrayList.add("g");

        System.out.println(stringSdaArrayList.getEveryNthElement(2, 3));
        try {
            System.out.println(stringSdaArrayList.getEveryNthElement(-1, 3));
        } catch (IllegalStateException e) {
            e.getMessage();
        }

        try {
            System.out.println(stringSdaArrayList.getEveryNthElement(3, -1));
        } catch (IllegalStateException e) {
            e.getMessage();
        }
    }
}
