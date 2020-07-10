package com.kalyan.javaapp;


import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("\na="+a+"\nb="+b);
    }
}
