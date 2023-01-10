package com.grading.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grading.model.Grade;
import com.grading.model.GradeCapacity;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long>{
	
	public Grade findByGrade(int grade);

}
