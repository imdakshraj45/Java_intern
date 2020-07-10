package com.kalyan.javaapp;

import java.util.Scanner;

class highestbid {

    public static void main(String[] args) {
        System.out.println("ENTER the 3 friend's bid");
        Scanner scanner = new Scanner(System.in);
        int bid1=scanner.nextInt();
        int bid2=scanner.nextInt();
        int bid3=scanner.nextInt();
        System.out.println("Highest Bid");
        if(bid1>bid2 && bid1>bid3)
        {
            System.out.println(bid1);
        }
        else if(bid2>bid3)
        {
            System.out.println(bid2);
        }
        else
        {
            System.out.println(bid3);
        }
    }
}