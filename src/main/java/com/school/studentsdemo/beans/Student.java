package com.school.studentsdemo.beans;

public class Student {
    private String name;
    private int age;
    private String registrationNumber;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}
