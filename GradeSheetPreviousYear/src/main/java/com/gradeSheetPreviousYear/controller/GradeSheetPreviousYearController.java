package com.gradeSheetPreviousYear.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gradeSheetPreviousYear.exception.GradeSheetPreviousYearApplicationException;
import com.gradeSheetPreviousYear.model.StudentPassedPreviousYr;
import com.gradeSheetPreviousYear.repository.GradeRepository;
import com.gradeSheetPreviousYear.service.GradeSheetPreviousYearService;
 

@RestController
@RequestMapping("/gradeSheetPreviousYear")
public class GradeSheetPreviousYearController { 
		@Autowired
		GradeSheetPreviousYearService gradeService;
		@Autowired
		GradeRepository gradeRepository;
		
		@PostMapping("/createGradeSheet")
		public ResponseEntity<StudentPassedPreviousYr> createGradeSheet(@Valid @RequestBody StudentPassedPreviousYr gradeDetails) throws GradeSheetPreviousYearApplicationException {
		 return new ResponseEntity<StudentPassedPreviousYr>(gradeService.createGradeSheet(gradeDetails), HttpStatus.OK);			
		}
		
		@GetMapping("/gradeSheet")
		public List<StudentPassedPreviousYr>  getAllGradeSheetData() {
			try {
				return    gradeService.getAllGradeSheet();
			} catch (GradeSheetPreviousYearApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ArrayList<StudentPassedPreviousYr>();
		}

		
		@GetMapping("/gradeSheet/{id}")
		public  StudentPassedPreviousYr  getGradeSheetDataByStudent(@PathVariable(value = "id") int studentId)
				throws GradeSheetPreviousYearApplicationException {
			StudentPassedPreviousYr studentPassedPreviousYr = gradeService.findByStudentId(studentId);
			return studentPassedPreviousYr;
		}

}
