package com.gradeSheetPreviousYear.service;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradeSheetPreviousYear.exception.GradeSheetPreviousYearApplicationException;
import com.gradeSheetPreviousYear.model.StudentPassedPreviousYr;
import com.gradeSheetPreviousYear.repository.GradeRepository; 

@Service
public class GradeSheetPreviousYearServiceImpl implements GradeSheetPreviousYearService {
	

    private static final Logger LOGGER = LoggerFactory.getLogger(GradeSheetPreviousYearServiceImpl.class);
    
	@Autowired
	private GradeRepository gradeRepository;

	@Override
	public StudentPassedPreviousYr createGradeSheet(StudentPassedPreviousYr gradeDetails) throws GradeSheetPreviousYearApplicationException {
		StudentPassedPreviousYr rate = null;
        try{
            rate = gradeRepository.save(gradeDetails);
        }catch (Exception ex){
            throw new GradeSheetPreviousYearApplicationException("Internal Server Error please contact admin");
        }
        if(Objects.isNull(rate)){
            throw new GradeSheetPreviousYearApplicationException("Internal Server Error please contact admin");
        }
        return rate;
    }

	
	@Override
	public List<StudentPassedPreviousYr> getAllGradeSheet() throws GradeSheetPreviousYearApplicationException { 
		return  gradeRepository.findAll(); 
	}

	
	@Override
	public StudentPassedPreviousYr findByStudentId(int studentId) throws GradeSheetPreviousYearApplicationException {
		return gradeRepository.findByStudentId(studentId);
	} 

}
