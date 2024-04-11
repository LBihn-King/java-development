package com.pluralsite;

import java.util.Scanner;

public class IfTesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        float num2 = scanner.nextInt();
        scanner.nextLine();

        String calcOptions = "Possible calculations\n   (A)dd\n   (S)ubtract\n   (M)ultiply\n   (D)ivide\nPlease select an option: " ;
        System.out.println(calcOptions);
        char selectedChar = scanner.next().charAt(0);

        double result;

        if (selectedChar == 'A') {
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
            } else if (selectedChar == 'S'){
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
            } else if (selectedChar == 'M') {
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
            } else if (selectedChar == 'D') {
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
            } else {System.out.println("Error: Not viable option");
            }

    }
}
