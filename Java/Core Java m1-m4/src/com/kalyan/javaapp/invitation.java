package com.kalyan.javaapp;

import java.util.Scanner;

public class invitation {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter Friend name");
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();
        System.out.println("Hey "+fname+" it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!");
    }
}
