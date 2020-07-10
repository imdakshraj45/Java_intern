package com.kalyan.javaapp;

import java.util.Scanner;

public class student {
    public String name;
    public int rollNo;
    public int marks;

    Scanner sc = new Scanner(System.in);
    public void setDetails()
    {
        System.out.print("Name: ");
        sc.nextLine();
        sc.nextLine();
        System.out.print("Roll no.: ");
        sc.nextInt();
        System.out.print("Marks: ");
        sc.nextInt();
    }
    public void getDetails()
    {
        System.out.print("Name:"+name);
        System.out.println("Roll no.:"+rollNo);
        System.out.println("Marks:"+marks);
    }

}
