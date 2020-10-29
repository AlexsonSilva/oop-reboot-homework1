package com.company;

public class Pencil {
    private String colour;

    public Pencil(String _colour){
        colour = _colour;
        System.out.println("Pencil is created");
    }
    public String getColour(){
        return colour;
    }

    @Override
    public String toString() {
        return String.format("The colour is: " + colour);
    }
}
