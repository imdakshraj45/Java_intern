package com.kalyan.javaapp;

abstract class Animal {
    abstract public void cats();
    abstract public void dogs();
}
class cats extends Animal{
    public void cats()
    {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {

    }
}
class dogs extends Animal{
    public void dogs()
    {
        System.out.println("Dog bark");
    }

    @Override
    public void cats() {

    }
}
class main{
    public static void main(String ar[])
    {
        Animal animal = new cats();
        animal.cats();
        dogs d = new dogs();
        d.dogs();
    }
}
