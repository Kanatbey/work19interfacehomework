package com.company;

public class Person {
    private String name;
    private int age;
    private String telNumber;

    public Person(String name, int age, String telNumber) {
        this.name = name;
        this.age = age;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "Age: " + age +
                "TelNumber: " + telNumber;
    }
}
