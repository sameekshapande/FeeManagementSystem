package com.student.payment.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.payment.model.Grade;
import com.student.payment.model.GradeFee;
import com.student.payment.repository.FeeGradeRepository;

@Component
public class PostContructImpl {
	
	@Autowired
    private GradingSvcRestConsumer gradingSvcRestConsumer;
	
	@Autowired
    private FeeGradeRepository feeGradeRepository;
	

	public PostContructImpl() {
		System.out.println("PostContructImpl Constructor called");
	}

	@PostConstruct
	public void runAfterObjectCreated() {
		List<GradeFee> gCList = new ArrayList();
    	List<Grade> grade = gradingSvcRestConsumer.getAllGrades();
    	for (Grade g : grade) {
    		GradeFee gF = new GradeFee();
    		gF.setFee(g.getFees());
    		gF.setGrade(g.getGrade());
    		System.out.println("PostContructImpl Constructor called"+g.getGrade());
    		feeGradeRepository.save(gF);
    	}
	}

}