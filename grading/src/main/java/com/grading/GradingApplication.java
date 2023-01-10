package com.grading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradingApplication.class, args);
	}

}
