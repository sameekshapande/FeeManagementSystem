package com.gradeSheetPreviousYear.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 

@Entity
public class StudentPassedPreviousYr {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	
	@Column
	private int grade;
	
	@Column
	private int studentId;

	@Column
	private String studentName;
	
	@Column
	private String passedCertificate;

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



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPassedCertificate() {
		return passedCertificate;
	}

	public void setPassedCertificate(String passedCertificate) {
		this.passedCertificate = passedCertificate;
	}

	@Override
	public String toString() {
		return "StudentPassedPreviousYr [Id=" + Id + ", grade=" + grade + ", studentID=" + studentId + ", studentName="
				+ studentName + ", passedCertificate=" + passedCertificate + "]";
	}

	public StudentPassedPreviousYr(Long id, int grade, int studentId, String studentName, String passedCertificate) {
		super();
		Id = id;
		this.grade = grade;
		this.studentId = studentId;
		this.studentName = studentName;
		this.passedCertificate = passedCertificate;
	}

	public StudentPassedPreviousYr() {
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
