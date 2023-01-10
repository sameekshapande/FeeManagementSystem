package com.grading.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grading.exception.GradeApplicationException;
import com.grading.model.Grade;
import com.grading.model.GradeCapacity;
import com.grading.repository.GradeRepository;
import com.grading.service.GradeMsService;
 

@RestController
@RequestMapping("/gradeservice")
public class GradeMsController { 
		@Autowired 
		GradeMsService gradeService;
		@Autowired 
		GradeRepository gradeRepository;
		
		@PostMapping("/createGrade")
		public ResponseEntity<Grade> createGrade(@Valid @RequestBody Grade gradeDetails) throws GradeApplicationException {
		 return new ResponseEntity<Grade>(gradeService.createGrade(gradeDetails), HttpStatus.OK);			
		}
		
		
		@GetMapping("/grades")
		public List<Grade> getAllGrades() throws GradeApplicationException {
			return gradeService.getAllGrades();
		}

		@GetMapping("/grades/{id}")
		public  Grade getGradeFeeDetailsByGrade(@PathVariable(value = "id") int gradeId)
				throws GradeApplicationException {
			Grade grade = gradeService.findByGrade(gradeId);
			return grade;
		}
		
}
