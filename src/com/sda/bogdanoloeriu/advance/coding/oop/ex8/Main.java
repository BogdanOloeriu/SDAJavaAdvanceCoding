package com.sda.bogdanoloeriu.advance.coding.oop.ex8;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Design the Joiner class, which in the constructor will take a separator (string) and have a join() method that allows
 * you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString() method and
 * separating them with a separator.
 * eg. for Integers and separator "-" it should return: 1-2-3-4
 */

public class Main {

    public static void main(String[] args) {

        Joiner<Integer> joinerInteger = new Joiner<>("-");
        System.out.println(joinerInteger.join(Arrays.asList(1,2,3,4,5,6)));

        Joiner<String> joinerString = new Joiner<>("=");
        System.out.println(joinerString.join(Arrays.asList("ABCDE","EWRSADA","GFDSGSD")));
    }
}
