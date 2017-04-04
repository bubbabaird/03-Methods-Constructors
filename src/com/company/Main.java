package com.company;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();

        c.make = "Chevy";
        c.model = "S-10 Blazer";
        c.millage = 122000;
        c.used = false;
        c.color = "green";
        c.year = 2020;

        Superhero hero = new Superhero();

        hero.age = 31;
        hero.mask = true;
        hero.partner = true;
        hero.weapon = "Numb Chucks";

        hero.setMale(false);

        Candy cc = new Candy();

        cc.chocolate = true;
        cc.manufacturer = "Hershey's";
        cc.name = "Butterfinger";
        cc.weight = 18;
        cc.withnuts = false;

        IceCream ic = new IceCream();

        ic.setChocolate(true);
        ic.manufacturer = "Bryers";
        ic.name = "Chunky Monkey";
        ic.netweight = 12;
        ic.price = 2.99;

        Restaurant r = new Restaurant();

        r.address = "1234 Roman Court";
        r.city = "Charlotte";
        r.state = "NC";
        r.zipCode = 28207;
        r.setName("Test");
        r.setName("Best Buy Test");

        System.out.println(cc.weight);
        System.out.println(ic.chocolate);



    }
}
