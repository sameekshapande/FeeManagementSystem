package com.student.enrollment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long studentId;
private String studentName;
private String grade;
private String mobileNumber;
private String schoolName;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public Student(String studentName, Long studentId, String grade, String mobileNumber, String schoolName) {
	 
	this.studentName = studentName;
	this.studentId = studentId;
	this.grade = grade;
	this.mobileNumber = mobileNumber;
	this.schoolName = schoolName;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentId=" + studentId + ", grade=" + grade + ", mobileNumber="
			+ mobileNumber + ", schoolName=" + schoolName + "]";
}
public Student() {
	//super();
	// TODO Auto-generated constructor stub
}
public Long getStudentId() {
	return studentId;
}
public void setStudentId(Long studentId) {
	this.studentId = studentId;
}
}
