package com.pluralsite;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TheaterReservations {
    static Scanner scanner = new Scanner(System.in);
    static String fullName;
    static String firstName;
    static String lastName;
    static String date;
    static int quantity;

    private static void getName() {
        System.out.println("Enter full name as (first last): ");
        fullName = scanner.nextLine().trim();
        String[] splitName = fullName.split(" ");
        firstName = splitName[0];
        lastName = splitName[1];
    }

    private static void getQuantity () {
        System.out.println("Enter ticket quantity: ");
        quantity = scanner.nextInt();
        scanner.nextLine();
    }

    private static void getDate () {
        System.out.println("Enter date as (MM/dd/yyyy): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        date = String.valueOf(LocalDate.parse(input, formatter));
    }

    private static void displayMessage () {
        getName();
        getQuantity();
        getDate();
        if (quantity == 1) {
            System.out.println(quantity + " tickets reserved for " + date + " under " + lastName + ", " + firstName);
        } else {
            System.out.println(quantity + " tickets reserved for " + date + " under " + lastName + ", " + firstName);
        }
    }

    public static void main (String[]args){
        displayMessage();
    }
}