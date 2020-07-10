package com.kalyan.javaapp;
import java.time.LocalDateTime;

class digitalclock {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
    }
}