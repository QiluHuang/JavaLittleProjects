package com.lol.bean;

// Customer 为实体对象，用来封装客户信息

public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    // Constructor
    // 空参
    public Customer() {}

    // 全参
    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }


    // Customer's name
    public void setName(String name) {
         this.name = name;
    }

    public String getName() {
        return name;
    }

    // Customer's gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    // Customer's age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Customer's phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    // Customer's email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

//    public static void main(String[] args) {
//        CMUtility cm = new CMUtility();
//        cm.readString(5);
//    }
}
