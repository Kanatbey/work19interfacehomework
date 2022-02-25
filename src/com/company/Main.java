package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person k = new Person("Aktan", 49, "0777212344");
        Person k1 = new Person("Akylai", 45, "0776712344");
        Person k2 = new Person("Akmaral", 20, "0775212354");
        Person k3 = new Person("Aisuluu", 25, "0707812344");

        Person e = new Person("Tolkun", 45, "0707878987");
        Person e1 = new Person("Tilek", 15, "0700099798");
        Person e2 = new Person("Totugul", 43, "0707234355");
        Person e3 = new Person("Akim", 5, "0707878989");

        Person a = new Person("Bektur", 26, "0505050501");
        Person a1 = new Person("Aijan", 24, "0505050403");
        Person a2 = new Person("Samatbek", 2, "0505050501");

        Kvartira kvartira = new Kvartira("Vostok-5", new Person[]{k, k1, k2, k3});
        Obshejitie obshejitie = new Obshejitie("Orto sai", new Person[]{e, e1, e2, e3});
        Gostinisa gostinisa = new Gostinisa("Jal", new Person[]{a, a1, a2});


        System.out.println(kvartira.toString());
        kvartira.komUslugaTolooable();
        System.out.println(obshejitie.toString());
        obshejitie.arendaTolooable();
        System.out.println(gostinisa.toString());
        gostinisa.arendaTolooable();

    }
}
