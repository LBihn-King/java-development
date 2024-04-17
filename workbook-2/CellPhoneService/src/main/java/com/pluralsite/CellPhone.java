package com.pluralsite;

public class CellPhone {
    private int serialNumber; //creates the variable so they can be used by the object
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() { //creates a new type of object and determines what kind of values it can have
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

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

}