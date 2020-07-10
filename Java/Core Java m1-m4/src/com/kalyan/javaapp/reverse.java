package com.kalyan.javaapp;


import java.util.Scanner;

class reverse {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 digit number: ");
        int num = scanner.nextInt();
        if(num>99 && num<1000)
            System.out.println("Yes, the number have 3 digits");
        else
            System.out.println("No, the number not have 3 digts");
        int[] ar=new int[3];
        for(int i=0;i<3;i++)
        {
            ar[i]=num%10;
            num/=10;
        }
        int j=0;
        while(j<3)
        {
            System.out.println(ar[j]);
            j++;
        }
    }
}
