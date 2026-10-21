package com.pluralsight;

public class CellPhoneApp {
    public static void main(String[] args) {
        //        Create a separate class named CellPhone. This class will be your blueprint for
//        creating CellPhone object instances. Similar to your own CellPhone

        CellPhone cellPhone;
        cellPhone = new CellPhone("Dana" , "800-555-5555");

        System.out.println(cellPhone.getName());
        System.out.println(cellPhone.getPhoneNumber());
    }
}
