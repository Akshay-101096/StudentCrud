package com.test.StudentCrud.service;

import java.util.List;

import com.test.StudentCrud.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
	public void deleteStudentById(int id);
	public void updateStudent(Student student);
	

}
