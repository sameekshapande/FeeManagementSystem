package com.grading.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
 

@Entity
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column(unique=true)
	@NotNull(message = "Grade is mandatory")
	private int grade;

	
	@NotNull(message = "Fees is mandatory")
	private int fees;
	
	@NotNull(message = "Capacity is mandatory")
	private int capacity;
	
	@NotBlank(message = "DueDate is mandatory")
	private String dueDate;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Grade() {
	 
		// TODO Auto-generated constructor stub
	}
	public Grade(Long id, int grade, int fees, int capacity,String dueDate) {
		super();
		Id = id;
		this.grade = grade;
		this.fees = fees;
		this.capacity = capacity;
		this.dueDate=dueDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
}
