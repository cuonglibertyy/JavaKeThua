package com.example.javakethua;

public class Person {
    String name ;
    String gender;
    String date_bird;
    String address ;

    public Person() {
    }

    public Person(String name, String gender, String date_bird, String address) {
        this.name = name;
        this.gender = gender;
        this.date_bird = date_bird;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_bird() {
        return date_bird;
    }

    public void setDate_bird(String date_bird) {
        this.date_bird = date_bird;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
