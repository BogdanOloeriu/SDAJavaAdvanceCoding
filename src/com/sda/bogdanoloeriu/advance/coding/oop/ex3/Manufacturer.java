package com.sda.bogdanoloeriu.advance.coding.oop.ex3;

import java.util.Objects;

/**
 * Create a Manufacturer class that will contain fields: name, year of establishment, country.
 * Include all necessary methods and constructor parameters.
 * Implement the hashCode() and equals() methods.
 * Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer),
 * and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3).
 * Include all necessary methods and constructor parameters.
 * Implement the hashcode() and equals() methods
 */

public class Manufacturer {

    private String name;
    private int year;
    private String country;

    public Manufacturer(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) o;
        return year == that.year && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    //double shift.
    //este ca sa compare key, hash code iti da locul unde se va pune in map elementul curent
    //daca nu as avea hashcode, la map am o pereche key value, hashcode se aplica pe key, se duce si imi cere hascodul pt key, dupa cu hash codul se duce la zona de momorie
    //coliziune - > elemente cu hashcode duplicat
    //hashcode vine pe partea de mapuri,nu doar pe mapuri, il mai gasim si la seturi
    //sa pun mereu hascode si equal la map,set
    @Override
    public int hashCode() {
        return Objects.hash(name, year, country);
    }
}
