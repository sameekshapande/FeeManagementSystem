package com.student.payment.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeePayment {
	
	@Id
	//@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long paymentId;
	@Column
	//@NotNull(message="studentId is not null")
	private int studentId;
	@Column
//	@NotNull(message="grade is not null")
	private int grade;
	@Column
//	@NotBlank(message="CardNumber is not null")
	private String CardNumber;
	@Column
//	@NotBlank(message="cardExpiry is not null")
	private String cardExpiry;
	@Column
//	@NotNull(message="feeAmountPaid is not null")
	private int feeAmountPaid;
	@Column
//	@NotNull(message="balanceAmount is not null")
	private int balanceAmount;
	@Column
	private Date feeDate;
	
	private String studentName;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
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
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public int getFeeAmountPaid() {
		return feeAmountPaid;
	}
	public void setFeeAmountPaid(int feeAmountPaid) {
		this.feeAmountPaid = feeAmountPaid;
	}
	public int getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public Date getFeeDate() {
		return feeDate;
	}
	public void setFeeDate(Date feeDate) {
		this.feeDate = feeDate;
	}
	
	public FeePayment() {
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "FeePayment [paymentId=" + paymentId + ", studentId=" + studentId + ", grade=" + grade + ", CardNumber="
				+ CardNumber + ", cardExpiry=" + cardExpiry + ", feeAmountPaid=" + feeAmountPaid + ", balanceAmount="
				+ balanceAmount + ", feeDate=" + feeDate + ", studentName=" + studentName + "]";
	}
	public FeePayment(Long paymentId, int studentId, int grade, String cardNumber, String cardExpiry, int feeAmountPaid,
			int balanceAmount, Date feeDate, String studentName) {
		super();
		this.paymentId = paymentId;
		this.studentId = studentId;
		this.grade = grade;
		CardNumber = cardNumber;
		this.cardExpiry = cardExpiry;
		this.feeAmountPaid = feeAmountPaid;
		this.balanceAmount = balanceAmount;
		this.feeDate = feeDate;
		this.studentName = studentName;
	}

}
