package com.divyaprojects.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divyaprojects.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
