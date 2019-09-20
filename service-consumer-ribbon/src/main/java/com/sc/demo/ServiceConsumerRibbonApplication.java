package com.sc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerRibbonApplication.class, args);
	}

}
