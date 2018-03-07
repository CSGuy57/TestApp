package com.example.daniellande.testapp;

/**
 * Created by daniel.lande on 2/22/2018.
 */

public class Animal {
    private String name;
    private String color;
    private double weight;

    // Constructor for the animal app
    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.color + " " + this.weight;
    }

    @Override
    public boolean equals(Object o) {
        Animal a = (Animal)o;
        return a.getName() == this.getName() &&
               a.getColor() == this.getColor() &&
               a.getWeight() == this.getWeight();

    }
}
