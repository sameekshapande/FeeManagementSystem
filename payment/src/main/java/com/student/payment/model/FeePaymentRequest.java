package com.student.payment.model;

public class FeePaymentRequest {
	private int studentId;
	private String studentName;
	private int grade;
	private String cardNumber;
	private String expiry;
	private String cvv;
	private int feeAamountPaid;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public FeePaymentRequest() { 
	}
	
	public int getFeeAamountPaid() {
		return feeAamountPaid;
	}
	public void setFeeAamountPaid(int feeAamountPaid) {
		this.feeAamountPaid = feeAamountPaid;
	}
 
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public FeePaymentRequest(int studentId, String studentName, int grade, String cardNumber, String expiry, String cvv,
			int feeAamountPaid) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
		this.feeAamountPaid = feeAamountPaid;
	}
	@Override
	public String toString() {
		return "FeePaymentRequest [studentId=" + studentId + ", studentName=" + studentName + ", grade=" + grade
				+ ", cardNumber=" + cardNumber + ", expiry=" + expiry + ", cvv=" + cvv + ", feeAamountPaid="
				+ feeAamountPaid + "]";
	}
}
