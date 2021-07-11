package com.company;

public class Bird {
    private String colour;
    private int numberOfWings;
    private int mumberOfLegs;
    private String name;

    public void setAtributes(String colour, int wings, int legs) {
        this.colour = colour;
        this.numberOfWings = wings;
        this.mumberOfLegs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void tellInfo() {
        System.out.println("Birds colour is: " + colour
                + ".It has " + numberOfWings + " wings, and " + mumberOfLegs + "legs");
        System.out.println("Bird name is " + name);
    }

    public void fly() {
        System.out.println("Bird fly");
    }

    public void sing() {
        System.out.println("Bird sing");
    }

    public void walk() {
        System.out.println("Bird walk");
    }
}
