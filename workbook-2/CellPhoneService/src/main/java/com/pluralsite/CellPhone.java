package com.pluralsite;
import java.util.Scanner;
public class CellPhone {
    Scanner scanner = new Scanner(System.in);
    private int serialNumber; //creates the variable so they can be used by the object
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //parameter constructor
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner ) {
        this.serialNumber = 0;
        this.model = " ";
        this.carrier = " ";
        this.phoneNumber = " ";
        this.owner = " ";
    }
    //parameterless constructor
    public CellPhone() { //
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    //getters
    public int getSerialNumber () { //creates a method that can be called to return a variable's value
        return serialNumber; //determines [serial number] as the variable whose value is returned
    }
    public String getModel () {
        return model;
    }
    public String getCarrier () {
        return carrier;
    }
    public String getPhoneNumber () {
        return phoneNumber;
    }
    public String getOwner () {
        return owner;
    }

    //setters
    public void setSerialNumber ( int serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setModel (String model){
        this.model = model;
    }
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setCarrier (String carrier){
        this.carrier = carrier;
    }
    public void setOwner (String owner){
        this.owner = owner;
    }

    public void dial (CellPhone phone) {
        System.out.println(getOwner() + "'s phone is calling "+ phone.getPhoneNumber());
    }
    public void dial (String dialing) {
        System.out.println(getOwner() + "'s phone is calling "+ dialing);
    }
}