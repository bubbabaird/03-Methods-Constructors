package com.company;

/**
 * Created by BUBBABAIRD on 3/28/17.
 */
public class Candy {
    double weight;
    boolean chocolate;
    String name;
    String manufacturer;
    boolean withnuts;

    public double weight(double w) {
    return w - 4.00;
    }

    // Homework assigned on 2017 03-30
    // In each class, write setters and getters for all of its fields.

    //weight
    public Double getWeight() {
        return weight;
    }

    //Setter Method that contains an IF statement
    public void setWeight() {
        if (weight > 0)
            this.weight = weight;
        else {
            System.out.print("There is no candy bar left to eat.");
        }
    }

    //chocolate
    public boolean getChocolate() {
        return chocolate;
    }

    public void setChocolate() {
        this.chocolate = chocolate;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    //withoutnuts
    public boolean getWithnuts() {
        return withnuts;
    }

    public void setWithnuts() {
        this.withnuts = withnuts;
    }
}
