package com.pluralsite;
import java.util.Scanner;
public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void createCellPhone(CellPhone phone){ //sets values for CellPhone type object
        System.out.println("What is the serial number?");
        phone.setSerialNumber(scanner.nextInt()); //sets value of CellPhone object [phone]'s 'serialNumber' variable to the next int entered
        scanner.nextLine();
        System.out.println("What model is the phone?");
        phone.setModel(scanner.nextLine()); //sets value of CellPhone object [phone]'s 'model' variable to the next String entered
        System.out.println("Who is the carrier?");
        phone.setCarrier(scanner.nextLine()); //sets value of CellPhone object [phone]'s 'carrier' variable to the next String entered
        System.out.println("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine()); //sets value of CellPhone object [phone]'s 'phoneNumber' variable to the next String entered
        System.out.println("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine()); //sets value of CellPhone object [phone]'s 'owner' variable to the next String entered
    }
    public static void printCellPhone(CellPhone phone) { //prints values of object
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }

    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        createCellPhone(phone1);
        printCellPhone(phone1);
    }

}
