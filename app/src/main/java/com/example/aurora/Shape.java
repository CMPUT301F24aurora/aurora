package com.example.aurora;

public abstract class Shape {
    private int x;
    private int y;
    String color = "red";

    public Shape(){
        
    }

    // Constructor to initialize x and y
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
