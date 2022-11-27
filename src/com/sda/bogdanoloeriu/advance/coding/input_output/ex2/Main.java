package com.sda.bogdanoloeriu.advance.coding.input_output.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a program that will count the occurrences of each word in a text file and then save the results in the form of
 * a table in a new file.
 * 1.Read all line from file
 * 2.split each line in words
 * 3.create a map with numbers of occurrences of each word -> Text appear 1  tine, then -> appear 2 times.
 * 4.write results in new file.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("C:\\Users\\oloer\\OneDrive\\Documents\\SDAJavaAdvanceCoding\\resources\\ex2.txt");
        if (Files.isDirectory(filePath)) {
            System.err.println("Given path it is not a File, it is a Directory");
            return;
        }
        if (!Files.exists(filePath)) {
            System.out.println("File does not Exists");
            return;
        }
        List<String> originalFileContent = Files.readAllLines(filePath);

        Map<String, Integer> numberOfOccurrencesForEachWord = new HashMap<>();
        for (String line : originalFileContent) { // ne intereseaza liniile, nu indexul
            for (String word : line.split(" ")) {
                if (numberOfOccurrencesForEachWord.containsKey(word)) {
                    numberOfOccurrencesForEachWord.put(word, numberOfOccurrencesForEachWord.get(word) + 1); //daca l am mai gasit o data doar incrementez
                } else {
                    numberOfOccurrencesForEachWord.put(word, 1);
                }
            }
        }

        System.out.println(numberOfOccurrencesForEachWord);

        Path writeNewFilePath = Paths.get("C:\\Users\\oloer\\OneDrive\\Documents\\SDAJavaAdvanceCoding\\resources\\ex2_results.txt");
        //tre sa iteram ca sa creeam o noua structura, ne trebuie un loc unde sa tin noile linii
        List<String> newFileContent = new ArrayList<>();
        //avem 3 metode de iterare in map: una bazata pe key (keyset), values -> imi da toate valorile, entryset iti da toate perechile Key - value
        newFileContent.add("Word                           NumberOfOccurrences");
        for (Map.Entry<String, Integer> entry : numberOfOccurrencesForEachWord.entrySet()) {

            newFileContent.add(entry.getKey() + String.format("%1$" +(30-entry.getKey().length()) + "s",entry.getValue()));

        }

        Files.write(writeNewFilePath, newFileContent);

    }
}
