package com.student.payment.service;

import javax.validation.Valid;

import com.student.payment.model.FeePaymentRequest;
import com.student.payment.model.FeePaymentResponse; 

public interface PaymentService {
	public FeePaymentResponse feePayment(@Valid FeePaymentRequest feePaymentRequest);
}
