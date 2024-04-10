package com.pluralsite;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        String calcOptions = "Possible calculations\n   (A)dd\n   (S)ubtract\n   (M)ultiply\n   (D)ivide\nPlease select an option: " ;
        System.out.println(calcOptions);
        char selectedChar = scanner.next().charAt(0);

        int result;

            switch (selectedChar) {
                case 'A':
                    result = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + result);
                    break;
                case 'S':
                    result = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + result);
                    break;
                case 'M':
                    result = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" + result);
                    break;
                case 'D':
                    result = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + result);
                    break;
            }

        }
    }

