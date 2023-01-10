package com.student.enrollment.service;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.enrollment.exception.StudentEnrollmentException;
import com.student.enrollment.model.Student;
import com.student.enrollment.repository.StudentRepository; 

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    private StudentRepository studentRepository;


	@Override
	public Student enrollStudent(Student studentDetail) throws StudentEnrollmentException {
		Student student = null;
        try{
        	student=  studentRepository.save(studentDetail);
        }catch (Exception ex){
        	ex.printStackTrace();
            throw new StudentEnrollmentException("Internal Server Error please contact admin");
        }
        if(Objects.isNull(student)){
        	System.out.println("Sameeksh");
            throw new StudentEnrollmentException("Internal Server Error please contact admin");
        }
        return student;
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	} 

 
}