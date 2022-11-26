package com.sda.bogdanoloeriu.advance.coding.oop.ex5;

/**
 * Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the perimeter
 * and calculateArea() for calculating the area.
 * Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract methods accordingly.
 * Verify the solution correctness.
 */

public class Main {

    public static void main(String[] args) {

        Shape3D qube = new Qube(100);
        System.out.println("Perimeter: " + qube.calculatePerimeter());
        System.out.println("Area of qube: " + qube.calculateArea());
        System.out.println("Volume of qube: " + qube.calculateVolume());

        qube.fill(200);
        qube.fill(2000000000);
    }
}
