package com.sda.bogdanoloeriu.advance.coding.oop.ex4;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA etc. constants.
 * Each vehicle has its own parameters, e.g. price, power, etc.
 * Enum should contain boolean isPremium() and boolean isRegular() methods.
 * The isPremium() method should return the opposite result to the call of the isRegular() method.
 *  In addition, the boolean isFasterThan() method should be declared and implemented as part of the enum class.
 *  This method should accept the Car type object and display information that the indicated vehicle is faster or not
 *  than the vehicle provided in the argument.
 *  To do this, use the compareTo() method.
 */

//nu ma lasa sa mostenesc la enum pt ca este o clasa care deja mosteneste din Enum cu E mare.
public enum Car {
    FERRARI(2_000_000,600,false),
    PORSCHE(1_000_000,550,false),
    MERCEDES(600_000,350,true),
    BMW(500_000,450,true),
    OPEL(40_000,150,true),
    FIAT(20_000,90,true),
    TOYOTA(45_000,200,true);

    private final double price; //cand sunt cu final nu ne lasa sa facem setteri.
    private final double power;

    private final Boolean isRegular;

    Car(double price, double power, Boolean isRegular) {
        this.price = price;
        this.power = power;
        this.isRegular = isRegular;
    }

    public double getPrice() {
        return price;
    }

    public double getPower() {
        return power;
    }

    public Boolean isRegular(){
    return isRegular;
    }

    public Boolean isPremium(){
        return !isRegular;
    }

    public boolean isFasterThen(Car car){
        int result = Double.compare(this.power,car.power);
        return result > 0;
    }

}
