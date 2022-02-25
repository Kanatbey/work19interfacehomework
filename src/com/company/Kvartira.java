package com.company;

import java.util.Arrays;

public class Kvartira implements KomUsluga {
    private String adress;
    //    Kvartira kvartira1 = new Kvartira("Akylai", 45, "0776712344", "Vostok-5");
//    Kvartira kvartira2 = new Kvartira("Akmaral", 20, "0775212354", "Vostok-5");
//    Kvartira kvartira3 = new Kvartira("Aisuluu", 25, "0707812344", "Vostok-5");
    Person[] family;

    public Kvartira(String adress, Person[] family) {
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
    public void komUslugaTolooable() {
        System.out.println("Квартира jashoochulary kom usluga toloshuudo.");
    }

    @Override
    public String toString() {
        return "Kvartira{ " +
                "\nAdress: " + adress + '\n' +
                Arrays.toString(family) +
                '}';
    }
}
