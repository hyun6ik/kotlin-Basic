package Lec21.java;

import java.util.UUID;

public class Person {

    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUUID() {
        return UUID.randomUUID().toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String myAddress() {
        return this.address;
    }
}
