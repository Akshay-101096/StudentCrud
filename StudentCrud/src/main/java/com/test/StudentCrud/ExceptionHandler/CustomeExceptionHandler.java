package com.test.StudentCrud.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.test.StudentCrud.customException.StudentNotFoundException;

@RestControllerAdvice
public class CustomeExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleStudentNotFound(StudentNotFoundException snfe){
		return new ResponseEntity<String>(snfe.getMessage(),HttpStatus.NOT_FOUND);
	}
}
