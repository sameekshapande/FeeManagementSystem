package com.student.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.payment.model.GradeFee;

public interface FeeGradeRepository extends JpaRepository<GradeFee, Long>{
	
	public GradeFee findByGrade(int grade);

}
 
