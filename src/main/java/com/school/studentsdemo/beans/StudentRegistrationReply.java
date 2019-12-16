package com.school.studentsdemo.beans;

public class StudentRegistrationReply {

    private String name;
    private int age;
    private String registrationNumber;
    private String registrationStatus;


    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public void setRegistrationStatus(String registrationStatus){
        this.registrationStatus = registrationStatus;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getRegistrationStatus(){
        return registrationStatus;
    }
}
