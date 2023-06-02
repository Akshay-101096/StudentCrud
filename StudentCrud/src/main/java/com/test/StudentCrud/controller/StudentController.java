package com.test.StudentCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.StudentCrud.model.Student;
import com.test.StudentCrud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
	Student stud = service.saveStudent(student);
		return ResponseEntity.ok().body(stud);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id){
		Student stud = service.getStudentById(id);
		return ResponseEntity.ok().body(stud);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> list = service.getAllStudent();
		return ResponseEntity.ok().body(list);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudentById(@PathVariable("id") int id){
		service.deleteStudentById(id);
		return new ResponseEntity<String>("Student '"+id+"'Deleted",HttpStatus.OK);
	}
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable("id") int id,@RequestBody Student student){
		Student dbId = service.getStudentById(id);
		dbId.setStudName(student.getStudName());
		dbId.setStudCity(student.getStudCity());
		dbId.setStudMob(student.getStudMob());
		dbId.setStudEmail(student.getStudEmail());
		service.saveStudent(dbId);
		return new ResponseEntity<String>("Student'"+id+"' Updated",HttpStatus.OK);
	}
}
