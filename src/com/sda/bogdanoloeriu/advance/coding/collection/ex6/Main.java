package com.sda.bogdanoloeriu.advance.coding.collection.ex6;

/**
 * Ex 6 Ratings received. Display their average. The numbers can not be less than 1 and greater than 6.
 */

public class Main {

    public static void main(String[] args) {

        ProductRatings productRatings = new ProductRatings("VW");

        System.out.println(productRatings.average());

        productRatings.addRating(4);
        productRatings.addRating(5);
        productRatings.addRating(4);
        productRatings.addRating(5);
        productRatings.addRating(3);
        productRatings.addRating(1);

        System.out.println(productRatings.average());

        try{
            productRatings.addRating(7);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }finally {
            System.out.println("Exception handled");
        }




    }




}
