package com.kalyan.javaapp;


import java.util.Scanner;

class sort {

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
        for(int j=0;j<size;j++)
        {
            for(int k=j+1;k<size;k++)
            {
                if(ar[j]>ar[k])
                {
                    int temp;
                    temp=ar[j];
                    ar[j]=ar[k];
                    ar[k]=temp;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
