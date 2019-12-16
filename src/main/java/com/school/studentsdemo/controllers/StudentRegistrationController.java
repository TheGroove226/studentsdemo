package com.school.studentsdemo.controllers;

import com.school.studentsdemo.beans.Student;
import com.school.studentsdemo.beans.StudentRegistration;
import com.school.studentsdemo.beans.StudentRegistrationReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value = "/students/newstudent")

    @ResponseBody()
    public StudentRegistrationReply registerStudent(@RequestBody Student student){
        System.out.println("In registerUser...");
        StudentRegistrationReply stdrgsreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);

        stdrgsreply.setName(student.getName());
        stdrgsreply.setAge((student.getAge()));
        stdrgsreply.setRegistrationNumber(student.getRegistrationNumber());
        stdrgsreply.setRegistrationStatus("Succesfull!");

        return  stdrgsreply;

    }
}
