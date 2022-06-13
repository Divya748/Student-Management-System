package com.divyaprojects.studentmanagementsystem.service;

import java.util.List;

import com.divyaprojects.studentmanagementsystem.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	Student getStudentById(Long id);
	
	void deleteStudentById(Long id);

}
