package com.company;

import java.util.Arrays;

public class Gostinisa implements Arenda {
    private String adress;
    Person[] family;


    public Gostinisa(String adress, Person[] family) {
        this.adress = adress;
        this.family = family;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public void arendaTolooable() {
        System.out.println("Hotel jashoochulary kom arenda toloshuudo.");
    }

    @Override
    public String toString() {
        return "Gostinisa { " +
                "\nAdress: " + adress + '\n' +
                Arrays.toString(family) +
                '}';
    }
}
