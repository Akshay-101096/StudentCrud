package com.test.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.StudentCrud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
