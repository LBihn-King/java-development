package com.pluralsite;

public class MathApp {

    public static void main(String[] args) {

        // Question 1
        float bobSalary = 16.50f, garySalary = 15.75f;
        System.out.println("The highest salary is " + Math.max(bobSalary, garySalary));
        // Question 2
        float carPrice = 22_485.00f, truckPrice = 82_990.00f;
        System.out.println("The lowest price is " + Math.min(carPrice, truckPrice));
        // Question 3
        double circleRadius = 7.25;
        double circleArea = Math.pow((circleRadius * Math.PI), 2);
        System.out.println("Circle area is " + circleArea);
        // Question 4
        double rootTestInitVal = 5.0f;
        System.out.println("Root of 5.0 is " + Math.sqrt(rootTestInitVal));
        // Question 5
        double x1 = 5, x2 = 85, y1 = 10, y2 = 50;
        System.out.println("Distance between (5,10) and (85,5) is " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2)));
        // Question 6
        double absPosTestInitVal = -3.8;
        System.out.println("Absolute Positive of -3.8 is " + Math.abs(absPosTestInitVal));
        // Question 7
        System.out.println("Random number between 0 and 1: " + Math.random());

    }
}
