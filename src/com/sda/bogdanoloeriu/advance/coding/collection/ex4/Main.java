package com.sda.bogdanoloeriu.advance.coding.collection.ex4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ex 4
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */


public class Main {

    public static void main(String[] args) {

        System.out.println(getCharactersPositions("ABCD"));
        System.out.println(getCharactersPositions("helloWorld"));

    }


    public static Map<Character, List<Integer>> getCharactersPositions(String input) {

        Map<Character, List<Integer>> positionsByChar = new HashMap<>();


        //input.toCharArray(); //iti da tot caracterul de array ABC -> ["A","B","C"];

        for (int i = 0; i < input.toCharArray().length; i++) {
            char currentChar = input.toCharArray()[i];
            if (positionsByChar.containsKey(currentChar)) {
                List<Integer> positionList = positionsByChar.get(currentChar);
                positionList.add(i);
                positionsByChar.put(currentChar, positionList); //l am convertit la string cu gilimelele alea
            } else {
                List<Integer> positionList = new ArrayList<>();
                positionList.add(i);
                positionsByChar.put(currentChar, positionList); //l am convertit la string cu gilimelele alea
            }
        }
        return positionsByChar;
    }
}
