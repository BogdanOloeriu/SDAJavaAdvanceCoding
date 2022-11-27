package com.sda.bogdanoloeriu.advance.coding.oop.ex9;

import java.util.ArrayList;
import java.util.List;

/**
 * Extend the ArrayList class by implementing the getEveryNthElement() method. This method returns a list of elements
 * and takes two parameters: the element index from which it starts and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 * ArrayList is a class -> extend a class -> deci tot o clasa
 */

//trebuie sa mi declar eu clasa mea genirica si ulterior ii pasez T ul mai departe la ArrayList


public class SdaArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int numberOfSkippedElements) { //mereu grija la datele de intrare
        List<T> collectorList = new ArrayList<>();
        if (startIndex < 0 || startIndex > size()) {
            throw new IllegalStateException("Invalid Start Index");
        }
        if (numberOfSkippedElements < 0) {
            throw new IllegalStateException("Invalid numberOfSkippedElements!");
        }
        for (int i = startIndex; i < size(); i += numberOfSkippedElements + 1) { //las daor size()-ul ca sa ma duca la size ul clasei,noi suntem lista
            collectorList.add(get(i));
        }
        return collectorList;
    }
}
