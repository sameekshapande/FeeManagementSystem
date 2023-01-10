package com.student.enrollment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.enrollment.exception.StudentEnrollmentException;
import com.student.enrollment.model.Student;
import com.student.enrollment.service.StudentService;
 

@RestController
@RequestMapping("/students")
public class StudentEnrollmentController {

	@Autowired StudentService studentService;
	
	@PostMapping("/enrollStudent")
	public ResponseEntity<Student> enrollStudent(@RequestBody Student student) throws StudentEnrollmentException {
	 return new ResponseEntity<Student>(studentService.enrollStudent(student), HttpStatus.OK);
		
	}
	
 
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
}
