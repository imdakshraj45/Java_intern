package com.kalyan.javaapp;

public class Pastry extends Cake{
    public Pastry(String name, float price) {
        super(name, price);
        this.name=name;
        this.price=price;
    }

    @Override
    public void display(){
        System.out.println(name+": Rs."+price+" per piece");
    }
}
