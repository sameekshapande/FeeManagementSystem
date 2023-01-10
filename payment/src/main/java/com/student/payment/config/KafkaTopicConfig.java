package com.student.payment.config;

import org.apache.kafka.clients.admin.NewTopic;
//import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.retrytopic.RetryTopicConfigurationBuilder;
@Configuration
public class KafkaTopicConfig {

	@Value("${spring.kafka.topic.name}")
	private String topicName;
	
	//springBean for kafka topic 
	
	
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name(topicName).build();
	}
	 
	 
}
