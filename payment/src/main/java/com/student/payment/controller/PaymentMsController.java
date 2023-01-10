package com.student.payment.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.payment.exception.PaymentApplicationException;
import com.student.payment.model.FeePaymentRequest;
import com.student.payment.model.FeePaymentResponse;
import com.student.payment.repository.PaymentRepository;
import com.student.payment.service.PaymentService;
import com.student.payment.service.PaymentServiceImpl;
 

@RestController
@RequestMapping("/paymentservice")
public class PaymentMsController { 
		@Autowired 
		PaymentService paymentService;
		@Autowired 
		PaymentRepository paymentRepository;

		private static final Logger LOGGER = LoggerFactory.getLogger(PaymentMsController.class);
		
		@PostMapping("/feePayment")
		public FeePaymentResponse feePayment(@Valid @RequestBody FeePaymentRequest feePaymentRequest) throws PaymentApplicationException {
			return paymentService.feePayment(feePaymentRequest);			
		} 
		
}
