package com.student.payment.model;

public class PaymentEvent {

	private String cardNumber;
	private  String studentName;
	private Long paymentId;
	private String paymentMessage;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMessage() {
		return paymentMessage;
	}
	public void setPaymentMessage(String paymentMessage) {
		this.paymentMessage = paymentMessage;
	}
	@Override
	public String toString() {
		return "PaymentEvent [cardNumber=" + cardNumber + ", studentName=" + studentName + ", paymentId=" + paymentId
				+ ", paymentMessage=" + paymentMessage + "]";
	}
	public PaymentEvent(String cardNumber, String studentName, Long paymentId, String paymentMessage) {
		super();
		this.cardNumber = cardNumber;
		this.studentName = studentName;
		this.paymentId = paymentId;
		this.paymentMessage = paymentMessage;
	}
	public PaymentEvent() {

	}
}
