package com.student.payment.service;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
 
import com.student.payment.exception.PaymentApplicationException;
import com.student.payment.model.FeePayment;
import com.student.payment.model.FeePaymentRequest;
import com.student.payment.model.FeePaymentResponse;
import com.student.payment.model.Grade;
import com.student.payment.model.GradeFee;
import com.student.payment.model.PaymentEvent;
import com.student.payment.repository.FeeGradeRepository;
import com.student.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentServiceImpl.class);

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private FeeGradeRepository feegradeRepository;
	
	@Autowired
	private PaymentRecieptProducer paymentRecieptProducer;
	
	@Autowired
	private GradingSvcRestConsumer gradingSvcRestConsumer;
	 

	@Override
	public FeePaymentResponse feePayment(@Valid FeePaymentRequest feePaymentRequest) {
		FeePaymentResponse feePaymentResponse = null;

    	Grade grade = gradingSvcRestConsumer.getGradeFeeDetailsByGrade(feePaymentRequest.getGrade());
		try {
			 feePaymentResponse = new FeePaymentResponse();
			FeePayment feePayment = new FeePayment();
			PaymentEvent paymentEvent = new PaymentEvent();
			LOGGER.info("feePayment : "+feePaymentRequest);
			if (feePaymentRequest.getCardNumber().equals("1111111111111111")
					&& feePaymentRequest.getExpiry().equals("11/25") && feePaymentRequest.getCvv().equals("123")) {
				feePaymentResponse.setPaymentStatus("Success");
				feePaymentResponse.setSendMessage("Payment is Success");
				feePaymentResponse.setGrade(feePaymentRequest.getGrade());
				feePaymentResponse.setStudentId(feePaymentRequest.getStudentId());

				feePayment.setCardNumber(feePaymentRequest.getCardNumber());
				feePayment.setStudentId(feePaymentRequest.getStudentId());
				feePayment.setFeeDate(new Date());
				feePayment.setFeeAmountPaid(feePaymentRequest.getFeeAamountPaid());
				feePayment.setGrade(feePaymentRequest.getGrade());
				feePayment.setCardExpiry(feePaymentRequest.getExpiry());
				feePayment.setStudentName(feePaymentRequest.getStudentName());

				//GradeFee g = feegradeRepository.findByGrade(feePaymentRequest.getGrade());
			//	int balanceAmount = g.getFee() - feePaymentRequest.getFeeAamountPaid();
			//	feePayment.setBalanceAmount(balanceAmount);
				LOGGER.info("feePaymentResponse : " + feePaymentResponse);
				paymentRepository.save(feePayment);

				paymentEvent.setCardNumber(feePayment.getCardNumber());
				paymentEvent.setPaymentId(feePayment.getPaymentId());
				paymentEvent.setStudentName(feePayment.getStudentName());
				paymentEvent.setPaymentMessage(
						"Dear " + feePayment.getStudentName() + "," + "You have successfully enrolled for the course");
				LOGGER.info("paymentEvent : " + paymentEvent);
				paymentRecieptProducer.sendMessage(paymentEvent);

			} else {
				feePaymentResponse.setPaymentStatus("Failure");
				feePaymentResponse.setSendMessage("Payment is Failed, Invalid card Number");
				feePaymentResponse.setGrade(feePaymentRequest.getGrade());
				feePaymentResponse.setStudentId(feePaymentRequest.getStudentId());
			}
			LOGGER.info("4 : ");
			return feePaymentResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return feePaymentResponse;
	}

}
