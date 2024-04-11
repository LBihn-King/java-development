package com.pluralsite;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter hours worked: ");
        float hours = scanner.nextFloat();
        System.out.println("Enter pay rate: ");
        float payRate = scanner.nextFloat();
        System.out.println(name + ", your gross pay is: " + hours * payRate);
    }
}
