package com.student.payment.model;

public class FeePaymentResponse {
	private String paymentStatus;
	private String sendMessage;
	private int studentId;
	private int grade;
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getSendMessage() {
		return sendMessage;
	}
	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
	}
	public FeePaymentResponse() { 
	}
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
	public FeePaymentResponse(String paymentStatus, String sendMessage, int studentId, int grade) {
		super();
		this.paymentStatus = paymentStatus;
		this.sendMessage = sendMessage;
		this.studentId = studentId;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "FeePaymentResponse [paymentStatus=" + paymentStatus + ", sendMessage=" + sendMessage + ", studentId="
				+ studentId + ", grade=" + grade + "]";
	}
	 

}
