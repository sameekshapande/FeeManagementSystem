package com.student.payment.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.student.payment.model.PaymentEvent;

@Service
public class PaymentRecieptProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentServiceImpl.class);
	@Autowired
	private NewTopic topic;

	private KafkaTemplate<String, PaymentEvent> kafaTemplate;

	public PaymentRecieptProducer(NewTopic topic, KafkaTemplate<String, PaymentEvent> kafaTemplate) {
		super();
		this.topic = topic;
		this.kafaTemplate = kafaTemplate;
	}
	
	public void sendMessage(PaymentEvent paymentEvent) {
		LOGGER.info("Payment Reciept Event "+paymentEvent.toString());
		
		//create Message  
		Message<PaymentEvent> message = MessageBuilder.withPayload(paymentEvent).
				setHeader(KafkaHeaders.TOPIC, topic.name()).build();
		kafaTemplate.send(message);
	}
}
