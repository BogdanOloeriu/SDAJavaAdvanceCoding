package com.sda.bogdanoloeriu.advance.coding.oop.ex7;

import com.sda.bogdanoloeriu.advance.coding.oop.ex6.Basket;
import com.sda.bogdanoloeriu.advance.coding.oop.ex6.BasketEmptyException;
import com.sda.bogdanoloeriu.advance.coding.oop.ex6.BasketFullException;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket(5);
        try {
            basket.addToBasket("Wine");
            basket.addToBasket("Wine");
            basket.addToBasket("Wine");
            basket.addToBasket("Wine");
            basket.addToBasket("Wine");
            basket.addToBasket("Wine");
        }catch (BasketFullException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println(basket);
        }


        //finaly nu se ruleaza doar cand se opreste programul inainte de linia de cod finaly.
        Basket basket1 = new Basket(3);
        try {
            basket1.removeFromBasket("Bread");
        }catch (BasketEmptyException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println(basket1);
        }

    }
}
