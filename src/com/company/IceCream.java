package com.company;

/**
 * Created by BUBBABAIRD on 3/28/17.
 */
public class IceCream {
    boolean chocolate;
    String manufacturer;
    double netweight;
    double price;
    String name;

    // Homework assigned on 2017 03-30
    // In each class, write setters and getters for all of its fields.

    //chocolate
    public boolean getChocolate() {
        return chocolate;
    }

    //Setter Method that contains an IF statement
    public void setChocolate(boolean chocolate) {
        if (chocolate == true)
            System.out.println("Chocolate is a GREAT choice!");
        this.chocolate = chocolate;
    }

    //manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer() {
        this.manufacturer = manufacturer;
    }

    //netweight
    public double getNetweight() {
        return netweight;
    }

    public void setNetweight() {
        this.netweight = netweight;
    }

    //price
    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
