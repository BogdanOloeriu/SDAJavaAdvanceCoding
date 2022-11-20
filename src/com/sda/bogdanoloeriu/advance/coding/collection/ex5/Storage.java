package com.sda.bogdanoloeriu.advance.coding.collection.ex5;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value)→ adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findKeys(String value) → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */

public class Storage {

    private final Map<String, List<String>> stringMap = new HashMap<>();  //tinem mai multe valori pt value


    public void addToStorage(String key, String value) {
        if (stringMap.containsKey(key)) {
            List<String> values = stringMap.get(key);
            values.add(value);
            stringMap.put(key, values);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            stringMap.put(key, values);
        }
    }

    public void printValue(String key) {
        List<String> mapStorage = stringMap.get(key);
        if (mapStorage == null) {
            System.out.println("No values for the key in map" + key);
        } else {
            System.out.println("Value for key : " + key + " -> " + mapStorage);
        }
    }

    public Set<String> findKeys(String value) {

        Set<String> keys = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : stringMap.entrySet()) {

            if (entry.getValue().contains(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public Set<String> findKeysWithStream(String value) {

        return stringMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(value)) //cu map convertesti
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
    }
}
