package com.company;

public class Bag {
    private String colour;

    public Bag(String _colour){
        colour = _colour;
        System.out.println("Bag is created");
    }

    public String getColour(){
        return colour;
    }

    @Override
    public String toString() {
        return String.format("The colour is: " + colour);
    }
}
