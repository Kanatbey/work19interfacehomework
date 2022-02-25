package com.company;

import java.util.Arrays;

public class Obshejitie implements Arenda {
    private String adress;
    Person[] family;


    public Obshejitie(String adress, Person[] family) {
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
        System.out.println("Общежитие jashoochulary kom arenda toloshuudo.");
    }

    @Override
    public String toString() {
        return "Obshejitie{" +
                "\nAdress: " + adress + '\n' +
                Arrays.toString(family) +
                '}';
    }
}
//1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
//        2. Квартирада жашагандар ком услуга толошот
//        3. Общежитие менен гостиницада жашагандар аренда толошот
//        4. Уй-булолор бир канча адамдан турушат
//        5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
//        6. Жашоо демек озунун адресин корсотуу