package com.student.payment.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.payment.model.Grade;

@FeignClient(name="GRADE-SERVICE")
public interface GradingSvcRestConsumer {

	
	@GetMapping("/gradeservice/grades")
    public List<Grade> getAllGrades();
	 
	
	@GetMapping("/gradeservice/grades/{id}")
    public  Grade getGradeFeeDetailsByGrade(@PathVariable(value = "id") int id);
	
}
