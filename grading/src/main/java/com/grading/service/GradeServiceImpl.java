package com.grading.service;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.grading.exception.GradeApplicationException;
import com.grading.model.Grade;
import com.grading.repository.GradeRepository; 

@Service
public class GradeServiceImpl implements GradeMsService {
	

    private static final Logger LOGGER = LoggerFactory.getLogger(GradeServiceImpl.class);
    
	@Autowired
	private GradeRepository gradeRepository;

	@Override
	public Grade createGrade(Grade gradeDetails) throws GradeApplicationException {
		Grade grade = null;
		try {
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(gradeDetails.getDueDate());
			grade = gradeRepository.save(gradeDetails);
		} catch (ConstraintViolationException cxe) {
			LOGGER.info("Same grade cannot be inserted " + cxe.getMessage());
			throw new GradeApplicationException("Same grade cannot be inserted");
		} catch (ParseException pxe) {
			LOGGER.info("Date Format Exception " + pxe.getMessage());
			throw new GradeApplicationException("Kindly provide data  in DD/MM/YYYY");
		} catch (Exception ex) {
			ex.printStackTrace();
			LOGGER.info("Internal Server Error please contact admin" + ex.getMessage());
			throw new GradeApplicationException("Internal Server Error please contact admin");
		}
		if (Objects.isNull(grade)) {
			throw new GradeApplicationException("Internal Server Error please contact admin");
		}
		return grade;
	}

	@Override
	public List<Grade> getAllGrades() throws GradeApplicationException { 
		return  gradeRepository.findAll(); 
	}

	@Override
	public Grade findByGrade(int gradeId) throws GradeApplicationException {
		return  gradeRepository.findByGrade(gradeId); 
	}

}
