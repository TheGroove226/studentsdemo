package com.school.studentsdemo.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
    private List<Student> studentRecords;
    private static StudentRegistration stdreg = null;
    private StudentRegistration(){
        studentRecords = new ArrayList<Student>();
    }

    public static StudentRegistration getInstance(){
        if(stdreg == null){
            stdreg = new StudentRegistration();
        }
        return stdreg;
    }

    public void add(Student std){
        studentRecords.add(std);
    }

    public String upDateStudent(Student std){
        for(int i = 0; i < studentRecords.size(); i++){
            Student stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())){
                studentRecords.set(i, std);
                return "Update successfull.";
            }
        }
    return "Update failed.";
    }

    public String deleteUser(String registrationNumber){
        for(int i = 0; i < studentRecords.size(); i++){
            Student stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber().equals(registrationNumber)){
                studentRecords.remove(i);
                return "Deleted succesfully.";
            }
        }
        return "Could not delete entry.";
    }

    public List<Student> getStudentRecords(){
        return studentRecords;
    }

}

