package com.example.myapplication;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstName, lastName, city, phoneNumber, email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String firstName, String lastName, String city, String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {

        this.firstName = "";
        this.lastName = "";
        this.city = "";
        this.phoneNumber = "";
        this.email = "";
    }
}
