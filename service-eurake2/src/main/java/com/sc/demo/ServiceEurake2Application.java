package com.sc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEurake2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurake2Application.class, args);
	}

}
