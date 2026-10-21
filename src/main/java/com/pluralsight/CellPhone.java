package com.pluralsight;

public class CellPhone {
    private String name;
    private String phoneNumber;

    public CellPhone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
//

//        Add a parameterless constructor (a constructor without parameters). Provide the
//        following default values in the constructor.
//         serialNumber = 0 (ex: 1000000 – 9999999)
//         model = ""
//                carrier = ""
//                 phoneNumber = ""
//                 owner = ""
//        Provide getter and setter methods for all 5 data members.


