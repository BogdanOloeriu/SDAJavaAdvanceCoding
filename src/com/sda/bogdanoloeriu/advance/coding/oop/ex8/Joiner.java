package com.sda.bogdanoloeriu.advance.coding.oop.ex8;

import java.util.List;

/**
 * Design the Joiner class, which in the constructor will take a separator (string) and have a join() method that allows
 * you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString() method and
 * separating them with a separator.
 * eg. for Integers and separator "-" it should return: 1-2-3-4
 */

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> elements) {
        String result = ""; //empty string ca daca l dam nul,dupa ne da batai de cap, ca trebuie verificat
        for (int i = 0; i < elements.size(); i++) { //cu toString convertim la string T-ul.
            result = result + elements.get(i).toString();
            if (i != elements.size() - 1) {
                result = result + separator;
            }
        }
        return result;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    @Override
    public String toString() {
        return "Joiner{" +
                "separator='" + separator + '\'' +
                '}';
    }
}
