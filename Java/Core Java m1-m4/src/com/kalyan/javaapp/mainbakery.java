package com.kalyan.javaapp;

import java.util.ArrayList;
import java.util.List;

public class mainbakery {
    public static void main(String ar[])
    {

        ArrayList<Cake> cakeList=new ArrayList();
        cakeList.add(new Cake("Chocolate Brownie",250));
        cakeList.add(new Cake("Chocolate Maple",350));

        ArrayList<Pastry> pastryList = new ArrayList();
        pastryList.add(new Pastry("Black Forest",35));
        pastryList.add(new Pastry("Choco Truffle",40));

        System.out.println("      Today's Special Menu     ");
        System.out.println("-------------------------------");

        System.out.println("Special Cakes");
        System.out.println("-------------------------------");
        for (Cake c: cakeList) {
            c.display();
        }

        System.out.println("\nSpecial Pastries");
        System.out.println("-------------------------------");
        for (Pastry p: pastryList) {
            p.display();
        }
    }
}
