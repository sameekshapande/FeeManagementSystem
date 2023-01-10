package com.student.payment.model;

public class Grade {
	 
	private Long Id; 
	private int grade;
 
	private int fees;
	 
	private int capacity;
	 
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
