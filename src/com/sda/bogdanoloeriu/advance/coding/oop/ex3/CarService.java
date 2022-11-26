package com.sda.bogdanoloeriu.advance.coding.oop.ex3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car,
 * 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
 */

public class CarService {

    //final, nu pot sa i schimb referinta, dar pot sa-i schimb continutul
    private final Set<Car> cars = new HashSet<>(); //nu l dau in constructor ca nu las pe nimeni sa umble la lista mea

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    public void removeCar(Car removeCar) {
        cars.remove(removeCar); //remove se foloseste de equals
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getAllCarsV12() {
        List<Car> carsWithV12 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                carsWithV12.add(car);
            }
        }
        return carsWithV12;
    }

    public List<Car> getAllCarsV12WithStream() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : cars) {
            if (mostExpensiveCar == null || car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }

        return mostExpensiveCar;
    }

    public Optional<Car> getMostExpensiveCarWithStream() {
        return cars.stream()
                .max(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));

    }

    public Optional<Car> getMostCheapestCar() {
        return cars.stream()
                .min(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));
    }

    public List<Car> getCarsWith3Manufactures() {
        return cars.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());

    }

    public List<Car> getAllCarsSortedByPrice(Boolean ascending) {
        return cars.stream()
                .sorted(((o1, o2) -> {
                    if (ascending) {
                        return Double.compare(o1.getPrice(), o2.getPrice());
                    } else {
                        return Double.compare(o2.getPrice(), o1.getPrice());
                    }
                }))
                .collect(Collectors.toList());
    }

    public Boolean containsCar(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWhichContainsManufactureWithEstablishment(String operator, int year) {

        return cars.stream()
                .filter(car -> {
                    switch (operator) {
                        case (">"):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYear() > year); //anymatch verifica daca ai cel putin o conditie valida si returneaza un boolean, mai este si allmatch pt toti
                        case ("<"):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYear() < year);
                        case (">="):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYear() >= year);
                        case ("<="):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYear() <= year);
                        case ("="):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYear() == year);
                        case ("!="):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYear() != year);
                        default:
                            throw new IllegalStateException("Invalid operator " + operator);
                    }

                })
                .collect(Collectors.toList());
    }

}
