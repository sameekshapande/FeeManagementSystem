package com.grading.service;

import java.util.List;

import com.grading.exception.GradeApplicationException;
import com.grading.model.Grade; 

public interface GradeMsService {
	public Grade createGrade(Grade gradeDetails) throws GradeApplicationException;
	 

	public List<Grade> getAllGrades() throws GradeApplicationException;


	public Grade findByGrade(int gradeId) throws GradeApplicationException;
}
