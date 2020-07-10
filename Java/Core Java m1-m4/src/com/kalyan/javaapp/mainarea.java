package com.kalyan.javaapp;

import java.util.Scanner;

public class mainarea {
    public static void main(String[] ar)
    {
        area a = new area();
        double area;
        double perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----AREA----");
        System.out.println("Rectangle");
        System.out.println("Length:");
        a.length = sc.nextFloat();
        System.out.println("Breadth:");
        a.breadth = sc.nextFloat();
        System.out.println("Area:");
        System.out.println(area=a.areaRectable());
        System.out.println("Perimeter: ");
        System.out.println(perimeter=a.calPerimeter());
        System.out.print("Radius: ");
        a.radius = sc.nextFloat();
        System.out.println("Area");
        System.out.print(a.areaCircle());
    }
}
