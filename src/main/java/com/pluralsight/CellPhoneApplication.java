package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(1000);
        cellPhone1.setModel("iPhone");
        cellPhone1.setCarrier("AT&T");
        cellPhone1.setPhoneNumber("773-555-5555");
        cellPhone1.setOwner("Dana");

        System.out.println("--Phone 1--");
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());

    }
}
