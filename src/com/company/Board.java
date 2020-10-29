package com.company;

public class Board {
    private String colour;

    public Board(String _colour){
        colour = _colour;
        System.out.println("Board is created");
    }

    public String getColour(){
        return colour;
    }

    @Override
    public String toString() {
        return String.format("The colour is: " + colour);
    }
}
