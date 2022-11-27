package com.sda.bogdanoloeriu.advance.coding.oop.ex6;

public class Main {

    public static void main(String[] args) {

        try {
            Basket basket = new Basket(10);
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
            basket.addToBasket("Bread");
        } catch (BasketFullException e) {
            e.printStackTrace();
        }

        try {
            Basket basket1 = new Basket(10);
            basket1.removeFromBasket("Bread");
        } catch (BasketEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}
