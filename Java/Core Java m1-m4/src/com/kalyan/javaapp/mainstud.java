package com.kalyan.javaapp;

import java.util.Scanner;

public class mainstud
{
    public static void main(String ar[])
    {
        student s[] = new student[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Total no. of Student's: ");
        int totStudent = sc.nextInt();
        for (int i = 0; i < totStudent; i++)
        {
            s[i] = new student();
            System.out.print("Name: ");
            sc.nextLine();
            s[i].name = sc.nextLine();
            System.out.print("Roll no.: ");;
            s[i].rollNo = sc.nextInt();
            System.out.print("Marks: ");
            s[i].marks = sc.nextInt();
        }
        System.out.println("Print");
        for (int i = 0; i <totStudent; i++)
        {
            System.out.println( "Name: "+s[i].name+"\nRoll no.: "+s[i].rollNo+"\nMarks: "+ s[i].marks);
        }

    }
}
