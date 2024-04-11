package com.pluralsite;
import java.util.Scanner;
public class RentalCarCalculator {

    static Scanner scanner = new Scanner(System.in);

    static float baseCost = 29.99f;
    static int age;
    static String pickupDate;
    static int rentalLength;
    static float tollTagCharge;
    static float gpsCharge;
    static float roadAsstCharge;
    static float surcharge;

    public static void Calculations(float tollTagCharge, float gpsCharge, float roadAsstCharge, float age, int rentalLength) {
        System.out.println("Would you like an electronic toll tag? Y/N: ");
        String tollTagSelect = scanner.nextLine();
        System.out.println("Would you like a GPS? Y/N: ");
        String gpsSelect = scanner.nextLine();
        System.out.println("Would you like roadside assistance? Y/N: ");
        String roadAsstSelect = scanner.nextLine();

        if (tollTagSelect.equals("Y")) {
            tollTagCharge = 3.95f;
        }

        if (gpsSelect.equals("Y")) {
            gpsCharge = 2.95f;
        }

        if (roadAsstSelect.equals ("Y")) {
            roadAsstCharge = 3.95f;
        }

        if (age <= 25) {
            surcharge = (baseCost + tollTagCharge + gpsCharge + roadAsstCharge) * 0.3f;
        }
        double total = (baseCost + tollTagCharge + gpsCharge + roadAsstCharge + surcharge) * rentalLength;
        System.out.printf("$%.02f(Base cost) + $%.02f(Toll tag) + $%.02f(GPS) + $%.02f(Roadside assistance) + $%.02f(Underage surcharge) * %d Days = Total of $%.02f", baseCost, tollTagCharge, gpsCharge, roadAsstCharge, surcharge, rentalLength, total);
    }

    public static void main(String[] args) {

        System.out.print("Enter pickup date: ");
        pickupDate = scanner.next();
        scanner.nextLine();
        System.out.println("Enter rental length in days: ");
        rentalLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        Calculations(tollTagCharge, gpsCharge, roadAsstCharge, age, rentalLength);



    }
}

