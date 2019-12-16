package com.school.studentsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.school"})
public class StudentsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsdemoApplication.class, args);
	}

}
