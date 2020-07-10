package com.kalyan.javaapp;
import java.util.*;
import java.util.Scanner;

import static java.lang.System.in;

public class studentid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's name :");
        String s_name = scanner.nextLine();
        System.out.println("Enter Student's age :");
        int s_age = scanner.nextInt();
        System.out.println("Enter Student's blood group :");
        String s_blood = scanner.next();
        String s_group;
        if (s_age >= 20) {
            s_group = "RED";
        } else if (s_age >= 15) {
            s_group = "BLUE";
        } else {
            s_group = "YELLOW";
        }

        System.out.println("-------------------------------");
        System.out.println("Name: " + s_name);
        System.out.println("Age: " + s_age);
        System.out.println("Blood Group: " + s_blood);
        System.out.println("Your Group is " + s_group);
    }
}
