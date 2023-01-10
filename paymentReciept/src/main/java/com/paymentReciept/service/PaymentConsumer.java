package com.paymentReciept.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.student.payment.model.PaymentEvent;

@Service
public class PaymentConsumer {


	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentConsumer.class);
	
	@KafkaListener(topics="${spring.kafka.topic.name}",groupId="${spring.kafka.consumer.group-id}")
	public void consume(PaymentEvent paymentEvent) {
		LOGGER.info("Payment Event recieved in "+paymentEvent.toString());
	}
}
