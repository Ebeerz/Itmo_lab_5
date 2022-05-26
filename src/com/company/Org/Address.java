package com.company.Org;

public class Address {

    private String street; //Поле не может быть null

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @Override
    public String toString() {
        return street + '\'' +
                '}';
    }
}

