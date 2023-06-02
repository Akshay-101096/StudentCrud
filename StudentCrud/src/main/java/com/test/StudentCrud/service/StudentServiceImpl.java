package com.test.StudentCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.StudentCrud.customException.StudentNotFoundException;
import com.test.StudentCrud.model.Student;
import com.test.StudentCrud.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository repo;
	
	@Override
	public Student saveStudent(Student student) {
		Student stud=repo.save(student);
		return stud;
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> opt = repo.findById(id);
		Student stud = opt.orElseThrow(()->new StudentNotFoundException("Student Not Exist"));
		return stud;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteStudentById(int id) {
		Student emp = getStudentById(id);
		repo.delete(emp);
		
	}

	@Override
	public void updateStudent(Student student) {
		repo.save(student);
		
	}
	

}
