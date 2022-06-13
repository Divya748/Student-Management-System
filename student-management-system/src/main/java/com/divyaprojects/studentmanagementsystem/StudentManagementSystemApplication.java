package com.divyaprojects.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.divyaprojects.studentmanagementsystem.entity.Student;
import com.divyaprojects.studentmanagementsystem.repository.StudentRepository;

//
@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		/*
		 * Student s1 = new Student("Divya","Mallela","divya@gmail.com");
		 * studentRepository.save(s1);
		 * 
		 * Student s2 = new Student("Akshay","Mallela","akshay@gmail.com");
		 * studentRepository.save(s2);
		 */
		 
		
		
	}

}
