package com.gradeSheetPreviousYear.service;

import java.util.List;

import com.gradeSheetPreviousYear.exception.GradeSheetPreviousYearApplicationException;
import com.gradeSheetPreviousYear.model.StudentPassedPreviousYr; 

public interface GradeSheetPreviousYearService {

	public StudentPassedPreviousYr createGradeSheet(StudentPassedPreviousYr gradeDetails)
			throws GradeSheetPreviousYearApplicationException;

	public List<StudentPassedPreviousYr> getAllGradeSheet() throws GradeSheetPreviousYearApplicationException;

	public StudentPassedPreviousYr findByStudentId(int studentId) throws GradeSheetPreviousYearApplicationException;
}
