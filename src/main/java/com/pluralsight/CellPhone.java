package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

//    Add a parameterless constructor (a constructor without parameters). Provide the
//    following default values in the constructor.
//    - serialNumber = 0 (ex: 1000000 – 9999999)
//    - model = ""
//    - carrier = ""
//    - phoneNumber = ""
//    - owner = ""
    public CellPhone (){
        this.serialNumber = 0;
        this.model = "";
        this.carrier="";
        this.owner="";
        this.phoneNumber="";
    }

//    Provide getter and setter methods for all 5 data members.

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
