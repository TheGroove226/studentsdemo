package com.school.studentsdemo.controllers;

import com.school.studentsdemo.beans.StudentRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentDeleteController {
    @RequestMapping(method = RequestMethod.DELETE, value = "student/delete{regdNum}")

    @ResponseBody
    public String deleteStudentRecord(@PathVariable("regdNum") String regdNum){
        return StudentRegistration.getInstance().deleteUser(regdNum);
    }
}
