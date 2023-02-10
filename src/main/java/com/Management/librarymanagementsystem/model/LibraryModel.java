package com.Management.librarymanagementsystem.model;

import java.util.List;

public class LibraryModel {
    private String name;
    private String address;
    private int number;
    private List<String> facilities;


    public LibraryModel(){

    }
    public LibraryModel(String name, String address, int number, List<String> facilities) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.facilities = facilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }
}
