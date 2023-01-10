package com.gradeSheetPreviousYear.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gradeSheetPreviousYear.model.StudentPassedPreviousYr;

@Repository
public interface GradeRepository extends JpaRepository<StudentPassedPreviousYr, Long>{
	
	public StudentPassedPreviousYr findByStudentId(int studentId);

}
