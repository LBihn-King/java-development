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

    public static void display(CellPhone phone) { //prints values of Cellphone object
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }

    public static void main(String[] args) { //calls methods and runs program
        CellPhone phone1 = new CellPhone(); //creates CellPhone object
        CellPhone phone2 = new CellPhone();

        createCellPhone(phone1); //sets phone1's variable values
        display(phone1); //prints phone1's variable values
        phone1.dial("855-555-2222"); //has phone1 call dial function with manually inputted phone number

        createCellPhone(phone2);
        display(phone2);
        phone2.dial("123-456-7890");

        phone1.dial(phone2.getPhoneNumber()); //has phone1 call dial with phone2's phone number value
        phone2.dial(phone1.getPhoneNumber());
    }
}
