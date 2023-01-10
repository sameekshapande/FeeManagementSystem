package com.student.enrollment.service;

import java.util.List;

import com.student.enrollment.exception.StudentEnrollmentException;
import com.student.enrollment.model.Student;

public interface StudentService {

	public Student enrollStudent(Student student) throws StudentEnrollmentException;
	
	public List<Student> getAllStudents();
 
 
}
