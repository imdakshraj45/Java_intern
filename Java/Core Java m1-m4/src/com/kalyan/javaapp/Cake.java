package com.kalyan.javaapp;

public class Cake {
    String name;
    float price;

    public Cake(String name, float price) {
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display(){
        System.out.println(name+": Rs."+price+" per pound");
    }


}
