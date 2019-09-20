package com.sc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.sc.demo.service")
public class ServiceConsumerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerHystrixApplication.class, args);
	}

}
