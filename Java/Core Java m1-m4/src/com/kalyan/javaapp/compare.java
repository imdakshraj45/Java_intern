package com.kalyan.javaapp;


import java.util.Arrays;
import java.util.Scanner;

class compare{

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] ar= new int[size];
        System.out.println("Enter an array elements: ");
        for(int i=0;i<size;i++)
        {
            ar[i]=scanner.nextInt();
        }
        int[] arr=new int[size];
        for(int j=0;j<size;j++)
        {
            arr[j]=ar[j];
        }
        System.out.println("Compare:\n \n");
        System.out.println(arr==ar);
        System.out.println(Arrays.equals(arr,ar));

    }
}
