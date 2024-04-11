package com.pluralsite;

import java.util.Scanner;

public class PayrollCalculator2 {

    static Scanner scanner = new Scanner(System.in);
    static String name;
    static float hours;
    static float payRate;
    static float grossPay = hours * payRate;

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        name = scanner.next();
        System.out.println("Enter hours worked: ");
        hours = scanner.nextFloat();
        System.out.println("Enter pay rate: ");
        payRate = scanner.nextFloat();
        System.out.println(name + ", your gross pay is: " + grossPay);
    }
}