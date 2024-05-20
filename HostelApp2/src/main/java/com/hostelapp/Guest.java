package com.hostelapp;

public class Guest {
    private String firstName;
    private String lastName;

    public boolean setFirstName(String firstName) {
        if(firstName.length() >= 2) {
            this.firstName = firstName;
            return true;
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
