package com.company;

/**
 * Created by BUBBABAIRD on 3/28/17.
 */
public class Car {
    double year;
    String make;
    String model;
    String color;
    boolean used;
    int millage;

    // Homework assigned on 2017 03-30
    // In each class, write setters and getters for all of its fields.

    //year
    public double getYear() {
        return year;
    }
    //Setter Method that contains an IF statement
    public void setYear(int year) {
        if (year < 2020) {
            this.year = year;
        }
    }

    //make
    public String getMake() {
        return make;
    }

    public void setMake() {
        this.make = make;
    }

    //model
    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    //color
    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    //used
    public boolean getUsed() {
        return used;
    }

    public void setUsed() {
        this.used = used;
    }

    //millage
    public int getMillage() {
        return millage;
    }

    public void setMillage() {
        this.millage = millage;
    }
}
