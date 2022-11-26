package com.sda.bogdanoloeriu.advance.coding.oop.ex3;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CarService service = new CarService();
        Manufacturer manufacturer1  = new Manufacturer("Audi",1998,"Germany");
        Manufacturer manufacturer2  = new Manufacturer("Audi",1970,"Romania");
        Manufacturer manufacturer3  = new Manufacturer("Audi",1999,"England");
        Manufacturer manufacturer4  = new Manufacturer("BMW",2005,"England");
        Manufacturer manufacturer5  = new Manufacturer("BMW",1600,"France");

        Car car = new Car(
                "A4",
                "break",
                20000,
                1998,
                Arrays.asList(manufacturer1,manufacturer2,manufacturer3), //ar trebuie sa mearga si cu List.of pt versiuni mai noi
                EngineType.V12
        );

        service.addCar(car);

        Car car2 = new Car(
                "M8",
                "Sport",
                35000,
                2018,
                Arrays.asList(manufacturer4,manufacturer5),
                EngineType.V8
        );

        service.addCar(car2);

        Car car3 = new Car(
                "M6",
                "Sport",
                40000,
                2019,
                Arrays.asList(manufacturer4,manufacturer5),
                EngineType.V6
        );

        service.addCar(car3);

        System.out.println("All cars in service: ");
        System.out.println(service.getAllCars());

        System.out.println("------------");
        System.out.println("All cars with V12");
        System.out.println(service.getAllCarsV12WithStream());

        System.out.println("-----------------------------------");
        System.out.println("All cars produced before 1999");
        System.out.println(service.getAllCarsBefore1999());

        System.out.println("-----------------------------------");
        System.out.println("Most expensive car: ");
        System.out.println(service.getMostExpensiveCar());

        System.out.println("-----------------------------------");
        System.out.println("Most cheapest car: ");
        System.out.println(service.getMostCheapestCar());

        System.out.println("-----------------------------------");
        System.out.println("Cars with at least 3 manufacturer:");
        System.out.println(service.getCarsWith3Manufactures());

        System.out.println("-----------------------------------");
        System.out.println("All cars ascending by price:");
        System.out.println(service.getAllCarsSortedByPrice(true));

        System.out.println("-----------------------------------");
        System.out.println("All cars descending by price:");
        System.out.println(service.getAllCarsSortedByPrice(false));

        Car car4 = new Car(
                "A4",
                "break",
                20000,
                1998,
                Arrays.asList(manufacturer1,manufacturer2,manufacturer3), //ar trebuie sa mearga si cu List.of pt versiuni mai noi
                EngineType.V12
        );

        //cu aia de mai sus car4 verific daca exista pt ca hascode cand le am compara parametrii obiectului si nu referinta din memorie
        System.out.println("-----------------------------------");
        System.out.println("Check if the car is in the service");
        System.out.println(service.containsCar(car4));

        Manufacturer manufacturer6  = new Manufacturer("Audi",1998,"Germany");

        System.out.println("All cars by manufacturer");
        System.out.println(service.getCarsByManufacturer(manufacturer6));

        System.out.println("All cars by manufacturer with year of establishment > ");
        System.out.println(service.getCarsWhichContainsManufactureWithEstablishment(">",1999));

        System.out.println("All cars by manufacturer with year of establishment ABC ");
        System.out.println(service.getCarsWhichContainsManufactureWithEstablishment("ABC",1999));

    }
}
