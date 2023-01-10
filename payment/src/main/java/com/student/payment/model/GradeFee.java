package com.student.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GradeFee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int  grade;
	@Column
	private int fee;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GradeFee(int id, int grade, int fee) {
		super();
		this.id = id;
		this.grade = grade;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "GradeFee [id=" + id + ", grade=" + grade + ", fee=" + fee + "]";
	}
	public GradeFee() {
		 
		// TODO Auto-generated constructor stub
	}
 
}
