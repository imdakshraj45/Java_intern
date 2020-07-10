package com.kalyan.javaapp;

public class dog {
    public String bread;
    public int size;
    public String color;

    public dog(){
        //default Constructor
        System.out.println("Default constructor");
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public dog(String b, int s, String c)
    {
        bread = b;
        size = s;
        color = c;
    }
}
