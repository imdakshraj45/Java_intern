package com.kalyan.javaapp;

public class rectangle{
    public double length;
    public double breadth;

    public void area()
    {
        double area = length*breadth;
        System.out.println("Area: "+area);
    }
    public void perimeter()
    {
        double perimeter = 2*(length+breadth);
        System.out.println("perimeter: "+perimeter);
    }
}
