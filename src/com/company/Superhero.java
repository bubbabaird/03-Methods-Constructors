package com.company;

/**
 * Created by BUBBABAIRD on 3/28/17.
 */
public class Superhero {
    boolean male;
    String weapon;
    int age;
    boolean mask;
    boolean partner;

    // Homework assigned on 2017 03-30
    // In each class, write setters and getters for all of its fields.

    //male
    public boolean getMale() {
        return male;
    }
    //Setter Method that contains an IF statement
    public void setMale(boolean female) {
        if (male = false)
            System.out.println("Please choose a female superhero");
        else {
            System.out.println("Please choose a male superhero");
        }
        this.male = female;
    }

    //weapon
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon() {
        this.weapon = weapon;
    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    //mask
    public boolean getMask() {
        return mask;
    }

    public void setMask() {
        this.mask = mask;
    }

    //partner
    public boolean getPartner() {
        return partner;
    }

    public void setPartner() {
        this.partner = partner;
    }
}
