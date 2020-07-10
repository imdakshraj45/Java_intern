package com.kalyan.javaapp;

import java.util.Scanner;

public class taxcalculator {
    public static void main(String[] ar){
        System.out.println("  TAX Calculator App");
        System.out.println("------Welcome-------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total person count");
        int totPerson= scanner.nextInt();
        String[] name= new String[totPerson];
        long[] income= new long[totPerson];
        for(int i=0;i<totPerson;i++)
        {
            System.out.println("Enter name "+(i+1));
            scanner.nextLine();
            name[i]=scanner.nextLine();
            System.out.println("Enter "+name[i]+"'s Annual Income:");
            income[i]=scanner.nextLong();
        }
        System.out.println("Names with liable taxes");
        System.out.println("-----------------------");
        for(int i=0;i<totPerson;i++)
        {
            calculateTax(name[i],income[i]);
        }
    }
    public static void calculateTax(String name,long income)
    {
        long tax;
        if(income>=300000)
        {
            tax=(long)(0.2*income);
        }
        else if(income>=100000)
        {
            tax=(long)(0.1*income);
        }
        else
        {
            tax=0;
        }
        System.out.println(name+":₹ "+tax );
    }
}
