package com.kalyan.javaapp;


import java.util.Arrays;
import java.util.Scanner;

class stringswap {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter both friend name:");
        System.out.print("a= ");
        String str1 = scanner.next();
        System.out.print("b= ");
        String str2 = scanner.next();
        int x= str1.length();
        str1=str1+str2;
        int z= str1.length();
        str2 = str1.substring(0,z-x);
        str1 = str1.substring(x,z);
        System.out.println("a="+str1+" b="+str2);
    }
}
