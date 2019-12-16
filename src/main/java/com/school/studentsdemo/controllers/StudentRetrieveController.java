package com.school.studentsdemo.controllers;

import com.school.studentsdemo.beans.Student;
import com.school.studentsdemo.beans.StudentRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentRetrieveController {

    @RequestMapping(method = RequestMethod.GET, value = "/student/allstudents")

    @ResponseBody
    public List<Student> getAllStudents(){
        return StudentRegistration.getInstance().getStudentRecords();
    }
}
