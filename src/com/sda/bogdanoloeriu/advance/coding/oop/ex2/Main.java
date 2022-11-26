package com.sda.bogdanoloeriu.advance.coding.oop.ex2;

/**
 * Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
 * Create a Movable interface with the move(MoveDirection moveDirection) method.
 * Implement the interface in the classes from the previous task (Point2D and Circle).
 * When the move(MoveDirection moveDirection) method is called, the objects are to change their position based on the provided direction (MoveDirection).
 * Validate the offset by calling the other Circle methods.
 *
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle). When calling the resize(double resizeFactor) method,
 * the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */

public class Main {

    public static void main(String[] args) {

        Point2D point1 = new Point2D(10, 15);
        Point2D point2 = new Point2D(5, 10);

        Circle circle = new Circle(point1, point2);

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        circle.move(new MoveDirection(2, 3));

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        System.out.println("--------------------");
        point1.move(new MoveDirection(3, 5));
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        circle.resize(5);
        System.out.println("--------------------");
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

    }
}
