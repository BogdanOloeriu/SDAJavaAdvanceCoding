package com.sda.bogdanoloeriu.advance.coding.collection.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex 6 Ratings received. Display their average. The numbers can not be less than 1 and greater than 6.
 */

public class ProductRatings {

    private final String name;
    private final List<Integer> ratingList = new ArrayList<>();

    public ProductRatings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 6) {
            ratingList.add(rating);
        } else {
            throw new IllegalArgumentException("Invalid Rating: " + rating);
        }
    }

    public double average() {
        if (ratingList.size() == 0) {
            return 0;
        }
        double sum = 0; //este egal cu 0
        for (Integer rating : ratingList) {
            sum = sum + rating;
        }
        return sum / ratingList.size();
    }

    public double averageWithStream() {

        return ratingList.stream().collect(Collectors.averagingDouble(ratingList -> ratingList));
    }
}
