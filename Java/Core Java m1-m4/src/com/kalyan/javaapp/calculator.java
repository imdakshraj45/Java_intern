package com.kalyan.javaapp;


import java.util.Arrays;
import java.util.Scanner;

class calculator{

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int ch = 0;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multipllication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.print(" Enter Your Choice: ");
        ch = scanner.nextInt();
        System.out.println("Enter 2 values:");
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        switch (ch)
        {
            case 1: double result = add(x,y);
                System.out.println(result);
                break;
            case 2: result = sub(x,y);
                System.out.println(result);
                break;
            case 3: result = mul(x,y);
                System.out.println(result);
                break;
            case 4: result = div(x,y);
                System.out.println(result);
                break;
            case 5: result = mod(x,y);
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
    public static double add(double a,double b)
    {
        return (a+b);
    }
    public static double sub(double a,double b)
    {
        return (a-b);
    }
    public static double mul(double a,double b)
    {
        return (a*b);
    }
    public static double div(double a,double b)
    {
        return (a/b);
    }
    public static double mod(double a,double b)
    {
        return (a%b);
    }
}
