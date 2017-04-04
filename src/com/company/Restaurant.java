package com.company;

/**
 * Created by BUBBABAIRD on 3/28/17.
 */
public class Restaurant {
    String name;
    String address;
    String city;
    String state;
    int zipCode;

    public String name(String name) {
        return name;
    }

    // Homework assigned on 2017 03-30
    // In each class, write setters and getters for all of its fields.

    //name
    public String getName() {
        return name;
    }

    //Setter Method that contains an IF statement
    public void setName(String newName) {
        if (!newName.contains("Best Buy")) {
            name = newName;
        }
    }

    //address
    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    //city
    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    //state
    public String getState() {
        return state;
    }

    public void setState() {
        this.state = state;
    }

    //zipCode
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode() {
        this.zipCode = zipCode;
    }

}
